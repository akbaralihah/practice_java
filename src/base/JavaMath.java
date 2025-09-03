package base;

import java.util.Scanner;

public class JavaMath {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
//            System.out.println(Math.max(1, 2)); // output: 2
//            System.out.println(Math.min(1, 2)); // output: 1
//
//            System.out.println(Math.sqrt(25)); // output: 5.0
//
            System.out.println(Math.random()); // from 0.0 to 1.0
            int randomNum = (int) (Math.random() * 101);
            System.out.println(randomNum); // from 0 to 100

        }
    }
}
