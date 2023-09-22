package service;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SegmentService {

    public void enterCoordinates () {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        System.out.print(x1 );
        System.out.print(y1 );
        System.out.print(x2 );
        System.out.print(y2 );
    }




}
