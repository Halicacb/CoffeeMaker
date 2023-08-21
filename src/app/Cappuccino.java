package app;

public class Cappuccino extends CoffeeDrink {
    String getName() {
        return "Cappuccino";
    }

    String prepare() {
        return "Making cappuccino...";
    }
}