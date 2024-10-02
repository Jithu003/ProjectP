public class PizzaOrderSystem {
    public static void main(String[] args) {
        PizzaFactory factory = new PizzaFactory();

        Pizza pizza1 = factory.createPizza("margherita");
        pizza1.prepare();
        pizza1.bake();
        pizza1.box();

        Pizza pizza2 = factory.createPizza("pepperoni");
        pizza2.prepare();
        pizza2.bake();
        pizza2.box();
    }
}
