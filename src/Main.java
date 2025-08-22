import java.util.Arrays;

public class Main {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Args: " + Arrays.toString(args));
        Main main = new Main();
        System.out.println(main.add(15, 2));
    }
}