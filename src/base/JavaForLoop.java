package base;

import java.util.Scanner;

public class JavaForLoop {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.print("Enter num = ");
//            byte num = scanner.nextByte();
//            for (int i = 0; i < num; i++) {
//                System.out.println(i);
//            }

            // Nested Loops
//            for (int i = 1; i <= 2; i++) {
//                System.out.println("Outer: " + i);
//                for (int j = 1; j <= 3; j++) {
//                    System.out.println(" Inner: " + j);
//                }
//            }

            // For-Each Loop
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            for (String car : cars) {
                System.out.println(car);
            }
        }
    }
}
