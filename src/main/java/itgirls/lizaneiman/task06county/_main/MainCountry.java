package _main;

import util.Menu;

public class MainCountry {
    public static void main(String[] args) {
        Menu menu = new Menu();
        for (int i = 0; i < menu.menuOptionsMessages.size(); i++) {
            int number = i + 1;
            System.out.println("<" + number + "> " + menu.menuOptionsMessages.get(i));

        }

        //menu.startMenu();
    }
}
