public class ConnectionManager {
    public static void main(String[] args) {
        DatabaseConnectionPool pool = DatabaseConnectionPool.getInstance();

        DatabaseConnection connection1 = pool.getConnection();
        connection1.connect();

        DatabaseConnection connection2 = pool.getConnection();
        connection2.connect();

        connection1.disconnect();
        pool.releaseConnection(connection1);
    }
}
