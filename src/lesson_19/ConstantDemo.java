package lesson_19;

public class ConstantDemo {

    public static final double PI = 3.141519;

    public static final int[] ints = new int[10];

    public static final String COUNTRY = "Germany";

    public static final String[] colors = {"red" ,"blue", "yellow" };

    private final int x;


    public ConstantDemo(int x) {
        this.x = x;

    }

    public int getX() {
        return x;
    }
    public void showCountry(){
        System.out.println("My country is " + COUNTRY);
    }
}
