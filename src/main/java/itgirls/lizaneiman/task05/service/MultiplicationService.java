package service;

public class MultiplicationService {
    static int[] numbers = {2, 3, 4, 5};

    public void printMultiplicationTable(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                int multiplicationResult = numbers[i] * numbers[j];
                System.out.println(numbers[i] + " x " + numbers[j] + " = " + multiplicationResult);
            }
            System.out.println();
        }
    }

    public static int[] getNumbers() {
        return numbers;
    }
}
