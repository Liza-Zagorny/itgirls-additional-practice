package util;

import controller.ViewController;

import java.util.Objects;
import java.util.Scanner;

public class Menu {

    private final ViewController viewController;

    public Menu() {
        viewController = new ViewController();
    }

    public void startMenu() {
        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);
        viewController.printMessage("Hello, this is a Country Menu.");

        boolean shouldContinue;
        do {
            this.showMenuOptions();
            viewController.printMessage("Please type any number to display desired info:");
            int menuChoice = scanner.nextInt();
            this.navigateTo(menuChoice);
            shouldContinue = this.shouldContinueMenu();
        } while (shouldContinue);

        viewController.printMessage("You've chosen to end the program. Bye-bye!");
    }

    private void showMenuOptions() {
        viewController.printNewLine();
        viewController.printMessage("<1> Display a Country Capital");
        viewController.printMessage("<2> Display a number of Regions");
        viewController.printMessage("<3> Display a total area of the Country");
        viewController.printMessage("<4> Display a list of Administrative Centres");
        viewController.printMessage("<5> Display the average age of country citizens");
        viewController.printMessage("<6> Display all citizens with selected full name length");
        viewController.printMessage("<7> Display all citizens with first name starting with selected letter");
    }

    private boolean shouldContinueMenu() {
        viewController.printNewLine();
        viewController.printMessage("Type `Y` to perform another Menu Option, or other character to end the program");
        Scanner scanner = new Scanner(System.in);
        boolean result = Objects.equals(scanner.next(), "Y");

        return result;
    }

    private void navigateTo(int choice) {
        viewController.printMessage("You've chosen " + choice);
    }
}
