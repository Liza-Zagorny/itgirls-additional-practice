package controller;

import view.ConsoleWriter;

public class ViewController {
    private final ConsoleWriter consoleWriter;

    public ViewController() {
        consoleWriter = new ConsoleWriter();
    }

    public void printMessage(String message) {
        consoleWriter.printMessage(message);
    }

    public void printNewLine() {
        consoleWriter.printNewLine();
    }
}
