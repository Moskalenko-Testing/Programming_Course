package lesson_03;

public class Variables {
    public static void main(String[] args) {

        int myFirstVariable;//Обьявление переменной типа int
        myFirstVariable = 1;//Первое присвоение значение перенной называется инициализация.
        int mySecondVariable = 25;
        System.out.println(mySecondVariable);
        mySecondVariable = 50;
        System.out.println("Значение переменной mySecondVariable: " + mySecondVariable);
        byte byteVariable = 125;
        System.out.println("byteVariable: " + byteVariable);
        byteVariable = -100;
        System.out.println("byteVariable: " + byteVariable);
        short shortVariable;
        shortVariable = 31000;
        System.out.println("shortVariable: " + shortVariable);
        long longVariable = 2_100_000_000_000_000L;
        System.out.println("longVariable:" + longVariable);

        double doubleVar = 10.5421;
        System.out.println("doubleVar: " + doubleVar);

        float floatVar = 11.52f;
        System.out.println("floatVar: " + floatVar);

    }
}
