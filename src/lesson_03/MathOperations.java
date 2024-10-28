package lesson_03;

public class MathOperations {
    public static void main(String[] args) {


        int var1 = 20;
        int var2 = 7;

        int result;

        result = var1 + var2;
        System.out.println("var1 + var2 = " + result);

        result = var1 - var2;
        System.out.println("var1 -var2 = " + result);

        result = var1 * var2;
        System.out.println("var1 * var2 = " + result);

        result = var1 / var2;
        System.out.println("var1 / var2 = " + result);

        int rest = var1 % var2;
        System.out.println("var1 % var2 = " + rest);

        double x = 20.0d;
        double y = 7.0;

        double resultDouble = x / y;
        System.out.println("resultDouble : " + resultDouble);

        int a = 20;
        int b = 7;
        int res = a / b;


        /*
        %d - целое число
        %s - текст
        %f - число с плавающей точкой
        %n - симлов новой строки
        \n - симлов новой строки
         */

        System.out.printf("Результат деления %d на %d равен %d\n",a, b,res);
        System.out.println("Test");

        System.out.printf("Округленный вывод результата деления %f\n" , resultDouble);
        System.out.printf("Округленный вывод результата деления %.3f\n" , resultDouble);



    }
}
