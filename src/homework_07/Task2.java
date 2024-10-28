package homework_07;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        /*
        Запишите в 4 переменные случайные числа от 0 до 100.
        Выведите все 4 числа на экран.
        Программа должна определить максимальное из этих четырех чисел и вывести результат на экран.
         */
        Random random = new Random();
        int v1 = random.nextInt(101);
        int v2 = random.nextInt(101);
        int v3 = random.nextInt(101);
        int v4 = random.nextInt(101);


        System.out.println(v1 + "|" + v2 + "|" + v3 + "|" + v4);
        int max = v1;
        if (v2 > max) {
            max = v2;
        }
        if (v3 > max) {
            max = v3;
        }
            if (v4 > max)
                max = v4;
            System.out.println("Максимальное значение : " + max);
        }

}
