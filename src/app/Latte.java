package app;

public class Latte extends CoffeeDrink {
    String getName() {
        return "Latte";
    }

    String prepare() {
        return "Preparing latte...";
    }
}
