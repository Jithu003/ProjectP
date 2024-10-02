import java.util.ArrayList;
import java.util.List;

public class DatabaseConnectionPool {
    private static DatabaseConnectionPool instance;
    private List<DatabaseConnection> connections;

    private DatabaseConnectionPool() {
        connections = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            connections.add(new DatabaseConnection("Connection " + (i + 1)));
        }
    }

    public static DatabaseConnectionPool getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionPool();
        }
        return instance;
    }

    public DatabaseConnection getConnection() {
        if (!connections.isEmpty()) {
            return connections.remove(0);
        }
        return null;  // No connections available
    }

    public void releaseConnection(DatabaseConnection connection) {
        connections.add(connection);
    }
}
