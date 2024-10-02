public class PizzaFactory {
    public Pizza createPizza(String type) {
        switch (type.toLowerCase()) {
            case "margherita":
                return new Margherita();
            case "pepperoni":
                return new Pepperoni();
            case "veggie":
                return new Veggie();
            default:
                return null;
        }
    }
}
