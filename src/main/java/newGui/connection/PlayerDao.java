package newGui.connection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class PlayerDao implements Dao<Player> {
    @Override
    public Player save(Player entity) {
        return null;
    }

    @Override
    public List<Player> getAll() {
        String sqlQuery = "SELECT * FROM players";
        List<Player> players = new ArrayList<>();
        Connection connection = ConnectionPool.getINSTANCE().getConnection();
        ConnectionPool.getINSTANCE().releaseConnection(connection);
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Player player = new Player();
                player.setId(resultSet.getLong(1));
                player.setName(resultSet.getString("name"));
                player.setSurname(resultSet.getString("surname"));
                player.setSport(resultSet.getString("sport"));
                player.setVegetarian(resultSet.getBoolean("vegeterian"));
                player.setOfYears(resultSet.getInt("of_years"));
                player.setColor(resultSet.getString("favourite_color"));
                players.add(player);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }


        return players;
    }

    public List<String> getColumnNames() {
        List<String> columnNames = new ArrayList<>();

        String sqlQuery = "SELECT * FROM players";
        List<Player> players = new ArrayList<>();
        Connection connection = ConnectionPool.getINSTANCE().getConnection();
        ConnectionPool.getINSTANCE().releaseConnection(connection);
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                String columnName = resultSetMetaData.getColumnName(i);
                columnNames.add(columnName);


            }
            ConnectionPool.getINSTANCE().releaseConnection(connection);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }


        return columnNames;

    }

    @Override
    public Player get(Long id) {
        return null;
    }

    @Override
    public Player update(Player player) {

        String sqlUpdate = """
                UPDATE players SET name = ?,
                 surname = ?,
                  sport = ?,
                  of_years = ?,
                  vegeterian = ?, 
                  favourite_color = ? WHERE id = ?
                  """;
        Connection connection = ConnectionPool.getINSTANCE().getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlUpdate)) {
            preparedStatement.setString(1, player.getName());
            preparedStatement.setString(2, player.getSurname());
            preparedStatement.setString(3, player.getSport());
            preparedStatement.setInt(4, player.getOfYears());
            preparedStatement.setBoolean(5, player.getVegetarian());
            preparedStatement.setString(6, player.getColor());
            preparedStatement.setLong(7, player.getId());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }finally {
            ConnectionPool.getINSTANCE().releaseConnection(connection);


        }

        return player;
    }


    @Override
    public boolean delete(Player entity) {
        return false;
    }
}
