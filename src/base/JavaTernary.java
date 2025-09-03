package base;

import java.util.Scanner;

public class JavaTernary {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter day number: ");
            byte day = scanner.nextByte();
            String name = (day > 5 || day < 8) ? "Weekend" : "Working";
            System.out.println(name);
        }
    }
}
