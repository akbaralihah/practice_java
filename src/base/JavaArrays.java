package base;

public class JavaArrays {
    public static void main(String[] args) {
//        String[] techBrands = {"Apple", "Samsung", "Dell", "HP", "Asus", "Lenovo"};
//        System.out.println(techBrands.length);

        // Java Multi-Dimensional Arrays

        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
//        for (int i = 0; i < myNumbers.length; ++i) {
//            for (int j = 0; j < myNumbers[i].length; j++) {
//                System.out.println(myNumbers[i][j]);
//            }
//        }

        for (int[] row: myNumbers) {
            for (int i : row) {
                System.out.println(i);
            }
        }
    }
}
