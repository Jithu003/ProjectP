public class ConnectionTest {
    public static void main(String[] args) {
        DatabaseConnectionPool pool = DatabaseConnectionPool.getInstance();

        for (int i = 0; i < 6; i++) {
            DatabaseConnection connection = pool.getConnection();
            if (connection != null) {
                connection.connect();
            } else {
                System.out.println("No available connections.");
            }
        }
    }
}
