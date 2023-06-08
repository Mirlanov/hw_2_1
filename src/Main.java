import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Level2 objectA = new Level2(10, "Sample");
        Level3 objectB = new Level3(20, "Example", true);
        Level3 objectC = new Level3(30, "Test", false);

        System.out.println("Object A:");
        System.out.println("Field 1: " + objectA.getField1());
        System.out.println("Field 2: " + objectA.getField2());
        objectA.method1();
        objectA.method2(5);

        System.out.println("\nObject B:");
        System.out.println("Field 1: " + objectB.getField1());
        System.out.println("Field 2: " + objectB.getField2());
        System.out.println("Field 3: " + objectB.getField3());
        objectB.method1();
        objectB.method2(9);

        System.out.println("\nObject C:");
        System.out.println("Field 1: " + objectC.getField1());
        System.out.println("Field 2: " + objectC.getField2());
        System.out.println("Field 3: " + objectC.getField3());
        objectC.method1();
        objectC.method2(8);
    }
}











