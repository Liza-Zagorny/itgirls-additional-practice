package util;

import controller.ViewController;
import model.entity.City;
import model.service.CountryService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Menu class contains general methods in order to interact with a "Country" program.
 * All inner-logic methods of this menu are located in MenuOptions class.
 */
public class Menu {

    private final ViewController viewController;

    public final ArrayList<String> menuOptionsMessages;

    public Menu() {
        viewController = new ViewController();
        menuOptionsMessages = new ArrayList<>(List.of(
                "Display a Country Capital",
                "Display a number of Regions",
                "Display a total area of the Country",
                "Display a list of Administrative Centres",
                "Display the average age of country citizens",
                "Display all citizens with selected full name length",
                "Display all citizens with first name starting with selected letter"
        ));
    }

    public void startMenu() {
        Scanner scanner = new Scanner(System.in);
        viewController.printMessage("Hello, this is a Country Menu.");

        boolean shouldContinue;
        do {
            this.showMenuOptions();
            viewController.printNewLine();
            viewController.printMessage("Please type any number to display desired info:");
            this.checkInt(scanner);
            shouldContinue = this.shouldContinueMenu();
        } while (shouldContinue);
        viewController.printMessage("You've chosen to end the program. Bye-bye!");
    }

    private void showMenuOptions() {
        viewController.printNewLine();
        for (int i = 0; i < this.menuOptionsMessages.size(); i++) {
            int number = i + 1;
            viewController.printMessage("<" + number + "> " + this.menuOptionsMessages.get(i));
        }
    }

    private boolean shouldContinueMenu() {
        viewController.printNewLine();
        viewController.printMessage("Type `Y` to perform another Menu Option, or other character to end the program");
        Scanner scanner = new Scanner(System.in);
        String enteredChar = scanner.next();
        return Objects.equals(enteredChar, "Y") || Objects.equals(enteredChar, "y");
    }

    private void navigateTo(int choice) {
        CountryService countryService = CountryService.getInstance();
        viewController.printMessage("You've chosen to " + menuOptionsMessages.get(choice - 1).toLowerCase() + ":");
        switch (choice) {
            case 1: {
                viewController.printMessage(countryService.getCapitalName());
            }
            break;
            case 2: {
                viewController.printMessage(countryService.getRegionsNumber());
            }
            break;
            case 3: {
                viewController.printMessage(countryService.getTotalCountryArea());
            }
            break;
            case 4: {
                ArrayList<City> administrativeCentres = countryService.getListOfAdministrativeCentres();
                for(City centre: administrativeCentres) {
                    viewController.printMessage(centre.toString());
                }
            }
            break;
            case 5: {
                viewController.printMessage("");
            }
            break;
            case 6: {
                viewController.printMessage("");
            }
            break;
            case 7: {
                viewController.printMessage("");
            }
            break;
            default:
                System.out.println("You've entered an illegal number. Please restart the program");
        }
    }

    private void checkInt(Scanner scanner) {
        if (scanner.hasNextInt()) {
            int menuChoice = scanner.nextInt();
            if (menuOptionsMessages.size() >= menuChoice) {
                this.navigateTo(menuChoice);
            } else {
                viewController.printMessage("You've entered an illegal number. Please choose between 1-7.");
                Scanner scanner1 = new Scanner(System.in);
                checkInt(scanner1);
            }
        } else {
            viewController.printMessage("You've entered some non-integer character. Please choose between 1-7.");
            Scanner scanner1 = new Scanner(System.in);
            checkInt(scanner1);
        }
    }
}
