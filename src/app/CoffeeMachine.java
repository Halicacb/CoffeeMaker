package app;
import java.util.Scanner;

public class CoffeeMachine {
    private final Scanner scanner;

    public CoffeeMachine() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Choose a drink:");
        System.out.println("  1 - Espresso");
        System.out.println("  2 - Cappuccino");
        System.out.println("  3 - Latte");
    }

    public void processUserChoice() {
        displayMenu();
        int choice = getUserChoice();

        CoffeeDrink coffeeDrink = createCoffeeDrink(choice);
        if (coffeeDrink != null) {
            System.out.println("Your " + coffeeDrink.getName() + ". Enjoy :)");
            System.out.println(coffeeDrink.prepare());
        } else {
            System.out.println("Invalid choice. Please select a valid drink.");
        }
    }

    private int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private CoffeeDrink createCoffeeDrink(int choice) {
        return switch (choice) {
            case 1 -> new Espresso();
            case 2 -> new Cappuccino();
            case 3 -> new Latte();
            default -> null;
        };
    }

    public void close() {
        scanner.close();
    }
}

