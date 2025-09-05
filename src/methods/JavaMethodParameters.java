package methods;

import java.util.Objects;

public class JavaMethodParameters {
    static void myMethod(String fullName) {
        System.out.println("Welcome, " + fullName);
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    static boolean isStaff(String username) {
        return Objects.equals(username, "akbaralihah");
    }
    public static void main(String[] args) {
//        myMethod("Akbarali");
//        myMethod("Boboyor");
//        myMethod("Bobur");
//        myMethod("Otajon");

        // Parameters
//        checkAge(20);

        // Return values
//        System.out.println(isStaff("akbaralihah"));

    }

}
