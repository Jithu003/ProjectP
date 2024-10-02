public class VIPUser extends User {
    public VIPUser(Mediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String msg) {
        System.out.println("VIP " + this.name + " sends: " + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("VIP " + this.name + " receives: " + msg);
    }
}
