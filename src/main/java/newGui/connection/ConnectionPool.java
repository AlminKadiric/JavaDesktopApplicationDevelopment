package newGui.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static newGui.connection.ConnectionParam.URL;
import static newGui.connection.ConnectionParam.USERNAME;
import static newGui.connection.ConnectionParam.PASSWORD;




public class ConnectionPool {

    private List<Connection> connectionPool = new ArrayList<>();

    String url= URL.getValue();
    String username = USERNAME.getValue();
    String password = PASSWORD.getValue();


    private static final int POOL_SIZE=10;
    private ConnectionPool(){
        for (int i = 0; i < POOL_SIZE; i++) {

            try {
                Connection connection = createConnection(url,username,password);
                connectionPool.add(connection);
            } catch (SQLException e) {
                System.err.println(e.getMessage());
            }


        }
    }
    private Connection createConnection(String url,String username,String password) throws SQLException {
        Connection connection = DriverManager.getConnection(url,username,password);
        return connection;

    }
    private static  ConnectionPool INSTANCE = null;
    private List<Connection> usedConnections = new ArrayList<>();
    public static ConnectionPool getINSTANCE() {
        if (INSTANCE==null){
            INSTANCE = new ConnectionPool();
        }
        return INSTANCE;
    }
    public Connection getConnection() {
        if (connectionPool.isEmpty()){
            throw new RuntimeException("Nema vise konekcija u bazenu");
        }
        Connection connection = connectionPool.remove(connectionPool.size()-1);
        usedConnections.add(connection);
        return connection;
    }
    public void releaseConnection(Connection connection){
        connectionPool.add(connection);
        usedConnections.remove(connection);
    }
}
