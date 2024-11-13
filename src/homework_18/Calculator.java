package homework_18;

/*
Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять

базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:

Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.
 */
public class Calculator {
    public static int SumOfIntegers(int a, int b) {

        return a + b;
    }

    public static int multiplicationOfIntegers(int x, int y) {

        return x * y;
    }

    public static int subtractionOfIntegers(int x1, int y1) {

        return x1 - y1;
    }

    public static double divisionOfIntegers(int a1, int b1) {
        if (b1 == 0) {
            System.out.println("Ошибка : деление на нуль недопустимо.");
            return 0;
        }
        return (double) a1 / b1;
    }

    public static void main(String[] args) {
        System.out.println("Сумма : " + Calculator.SumOfIntegers(10,5));
        System.out.println("Умножение : " + Calculator.multiplicationOfIntegers(10,5));
        System.out.println("Вычитание : " + Calculator.subtractionOfIntegers(10,5));
        System.out.println("Деление : " + Calculator.divisionOfIntegers(10,5));

    }
}


