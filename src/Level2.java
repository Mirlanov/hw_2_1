public class Level2 extends Level1 {
    private ComplexType field3;
    private EnumType field4;

    public Level2(int field1, String field2) {
        super(field1, field2);
        field3 = new ComplexType();
        field4 = EnumType.VALUE1;
    }


    public ComplexType getField3() {
        return field3;
    }

    public EnumType getField4() {
        return field4;
    }

    public void method1() {
        System.out.println("Method 1 in Level2");
    }

    public void method2(int value) {
        System.out.println("Method 2 in Level2: " + value);
    }

    public final void method3() {
        System.out.println("Non-overridable method in Level2");
    }
}



