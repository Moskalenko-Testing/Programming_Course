package lesson_25.generics;

public class SimpleApp {
    public static void main(String[] args) {
        SimpleBox simpleBox = new SimpleBox(10);
        System.out.println(simpleBox);

        SimpleBox simpleBox1 = new SimpleBox(20);
        System.out.println(simpleBox1);

        int sum = (int)simpleBox1.getValue() + (int)simpleBox.getValue();
        System.out.println("sum: " + sum);

        SimpleBox[] boxes = new SimpleBox[3];
        boxes[0]= simpleBox;
        boxes[1]= simpleBox1;
        boxes[2]=new SimpleBox("30");

        int sum1 = 0;
        for (int i = 0; i < boxes.length; i++) {
            sum1 = sum1 + (int)boxes[i].getValue();
        }

        System.out.println("sum1: " + sum1);

    }
}
