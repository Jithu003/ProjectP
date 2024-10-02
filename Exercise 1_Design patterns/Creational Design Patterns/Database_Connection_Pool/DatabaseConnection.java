public class DatabaseConnection {
    private String name;

    public DatabaseConnection(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void connect() {
        System.out.println(name + " is connected.");
    }

    public void disconnect() {
        System.out.println(name + " is disconnected.");
    }
}
