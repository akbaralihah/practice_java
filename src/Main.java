import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            byte age = scanner.nextByte();
            if (age >= 18) {
                System.out.println("Now, you are adult");
            } else {
                System.out.println("You are child!");
            }
        }
    }
}       