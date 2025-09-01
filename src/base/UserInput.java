package base;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            String[] fullName = scanner.nextLine().split(" ");
            System.out.println("Welcome, " + fullName[0] + " " + fullName[1]);
        }
    }
}
