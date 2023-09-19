package _main;

import service.MultiplicationService;

public class MainTask05 {
    public static void main(String[] args) {
        MultiplicationService multiplicationService = new MultiplicationService();
        int[] numbers = MultiplicationService.getNumbers();
        multiplicationService.printMultiplicationTable(numbers);
    }
}