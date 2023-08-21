package app;

public class Espresso extends CoffeeDrink {
    String getName() {
        return "Espresso";
    }

    String prepare() {
        return "Brewing espresso...";
    }
}
