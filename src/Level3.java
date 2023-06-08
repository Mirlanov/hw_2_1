public final class Level3 extends Level2 {
    private boolean field5;

    public Level3(int field1, String field2, boolean field5) {
        super(field1, field2);
        this.field5 = field5;
    }

    public boolean isField5() {
        return field5;
    }


    @Override
    public void method1() {
        System.out.println("Method 1 in Level3 (override)");
    }
}

