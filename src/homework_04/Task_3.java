package homework_04;

public class Task_3 {
    public static void main(String[] args) {
        /*
        Напишите программу, которая:
        Объявляет переменную long с именем bigNumber и присваивает ей значение 15000000000 (15 миллиардов).
Преобразует bigNumber в int с помощью явного преобразования и сохраняет результат в переменную int с именем smallNumber.
Выводит значение smallNumber на экран.
         */
        long bigNumber = 15000000000L;
        int smallNumber = (int) bigNumber;
        System.out.println("smallNumber : " + smallNumber);

    }
}
