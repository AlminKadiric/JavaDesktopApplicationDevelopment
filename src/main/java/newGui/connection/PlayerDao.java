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
            while (resultSet.next()){
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
    public List<String> getColumnNames(){
        List<String> columnNames = new ArrayList<>();

        String sqlQuery = "SELECT * FROM players";
        List<Player> players = new ArrayList<>();
        Connection connection = ConnectionPool.getINSTANCE().getConnection();
        ConnectionPool.getINSTANCE().releaseConnection(connection);
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery)) {
            ResultSet resultSet = preparedStatement.executeQuery();
           ResultSetMetaData resultSetMetaData =  resultSet.getMetaData();
           int columnCount = resultSetMetaData.getColumnCount();
            for (int i = 1; i <=columnCount ; i++) {
               String columnName =  resultSetMetaData.getColumnName(i);
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
    public Player update(Player entity) {


        return null;
    }

    @Override
    public boolean delete(Player entity) {
        return false;
    }
}
