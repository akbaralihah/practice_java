import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String[] fullName = scanner.nextLine().split(" ");
        System.out.printf("Firstname: %s\nLastname: %s", fullName[0], fullName[1]);

        scanner.close();
    }
}