package homework_19.Calculator;

/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять

базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:

Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.

Методы для вычисления длины окружности и площади круга, принимающий радиус и возвращающий результат.
- Константу (число Пи)
 */
public class Calculator {
    public static final double PI = 3.141519;

    public static int SumOfIntegers(int a, int b) {

        return a + b;
    }

    public static int multiplicationOfIntegers(int x, int y) {

        return x * y;
    }

    public static int subtractionOfIntegers(int x1, int y1) {

        return x1 - y1;
    }

    public static double divisionOfIntegers(double a1, double b1) {
        if (b1 == 0) {
            System.out.println("Ошибка : деление на нуль недопустимо.");
            return 0;
        }
        return (double) a1 / b1;
    }
    // C=2πR , S=πR
    public static int circumferenceLength(int r){
        double result = 2 * PI * r;
        return (int) result;
    }
    public static int circleArea(int r){
        double result = PI * Math.pow(r,2);
        return (int) result;
    }
}


