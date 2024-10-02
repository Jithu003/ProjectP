public class MessagingSystem {
    public static void main(String[] args) {
        Mediator chatServer = new ChatServer();

        User user1 = new RegularUser(chatServer, "Alice");
        User user2 = new RegularUser(chatServer, "Bob");
        User vipUser = new VIPUser(chatServer, "Charlie");

        chatServer.addUser(user1);
        chatServer.addUser(user2);
        chatServer.addUser(vipUser);

        user1.send("Hello everyone!");
        vipUser.send("Hi Alice!");
    }
}
