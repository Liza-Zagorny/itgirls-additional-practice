package _main;

import service.MultiplicationService;
import service.SegmentService;

public class MainTask05 {
    public static void main(String[] args) {
        // Multiplication table exercise
        MultiplicationService multiplicationService = new MultiplicationService();
        int[] numbers = MultiplicationService.getNumbers();
        //multiplicationService.printMultiplicationTable(numbers);

        // Segments exercise
        SegmentService segmentService = new SegmentService();
        segmentService.enterCoordinates();


    }
}