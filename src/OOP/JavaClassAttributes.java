package OOP;

public class JavaClassAttributes {
    int x = 5;
    int y = 3;

    public static void main(String[] args) {
        JavaClassAttributes obj1 = new JavaClassAttributes();
        JavaClassAttributes obj2 = new JavaClassAttributes();
        obj1.x = 25; // override existing values
        System.out.println(obj1.x);
        System.out.println(obj2.x);
    }
}
