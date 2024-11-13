package lesson_18;

public class TestStatic {

    int x;
    static int staticY;

    public static void staticMethod() {

        staticY++;
    }
    public void nonStaticMethod(){
        x++;
        staticY++;
        staticMethod();
    }

    public static void main(String[] args) {

        TestStatic.staticMethod();

        TestStatic testStatic = new TestStatic();

        testStatic.nonStaticMethod();

        int sum = MathUtil.sumOfIntegers(1,2,5,6,7,8);

        System.out.println("sum : " + sum);

        MathUtil.setCounter(10);
        System.out.println(MathUtil.getCounter());

    }
}
