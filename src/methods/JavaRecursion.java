package methods;

public class JavaRecursion {
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int superSum(int start, int end) {
        if (end > start) {
            return end + superSum(start, end - 1);
        } else {
            return end;
        }
    }

public static void main(String[] args) {
        int res1 = sum(10);
        System.out.println("Sum = " + res1);

        int res2 = superSum(4, 6);
        System.out.println("Super sum = " + res2);
    }
}
