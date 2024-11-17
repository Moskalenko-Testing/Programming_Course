package homework_19.Calculator;

public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("Сумма : " + Calculator.SumOfIntegers(10, 5));
        System.out.println("Умножение : " + Calculator.multiplicationOfIntegers(10, 5));
        System.out.println("Вычитание : " + Calculator.subtractionOfIntegers(10, 5));
        System.out.println("Деление : " + Calculator.divisionOfIntegers(10, 5));
        System.out.println("\n=====================\n");

        System.out.println("Длина окружности : " + Calculator.circumferenceLength(15));
        System.out.println("Площадь круга: " + Calculator.circleArea(7));
    }
}
