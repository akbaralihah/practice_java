package base;

import java.util.Scanner;

public class JavaSwitch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter week day number: ");
            int weekDayNumber = scanner.nextByte();
            switch (weekDayNumber) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("The day of the week in this number doesn't exist!");
            }
        }
    }
}
