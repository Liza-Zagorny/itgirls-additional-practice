package service;

import java.util.Arrays;
import java.util.Scanner;

public class SegmentService {
    int[] aCoords = new int[2];
    int[] bCoords = new int[2];

    public void enterCoordinates() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числовое значение x для точки A:");
        aCoords[0] = scanner.nextInt();
        System.out.println("Введите числовое значение y для точки A:");
        aCoords[1] = scanner.nextInt();
        System.out.println("Введите числовое значение x для точки B:");
        bCoords[0] = scanner.nextInt();
        System.out.println("Введите числовое значение y для точки B:");
        bCoords[1] = scanner.nextInt();
    }

    public void calcSegmentLength() {
        double lengthSquare = Math.pow(bCoords[0] - aCoords[0], 2) + Math.pow(bCoords[1] - aCoords[1], 2);
        double length =  Math.sqrt(lengthSquare);
        System.out.println("Длина отрезка АВ (A"+ Arrays.toString(aCoords)+", B"+ Arrays.toString(bCoords)+"): "+length);
    }
}
