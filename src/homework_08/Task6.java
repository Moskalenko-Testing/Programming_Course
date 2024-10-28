package homework_08;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        /*
        Создать массив целых чисел произвольной длины от 5 до 15. Заполнить массив случайными значениями от -50 до 50.
        Вывести на экран:
        Минимальное значение в массиве
        Максимальное значение в массиве
        Среднее арифметическое всех значений в массиве
         */
        int[] array = new int[8];
        Random random = new Random();
        int k = 0;
        int min, max;
        int sum = 0;

        while (k < array.length) {
            array[k] = random.nextInt(101) - 50;
            sum += array[k];
            k++;
        }
        min = array[0];
        max = array[0];

        k = 1;
        while (k < array.length) {
            if (array[k] < min) {
                min = array[k];
            }
            if (array[k] > max) {
                max = array[k];
            }
            k++;
        }
        int average = sum / array.length;


        System.out.print("Масив: ");
        k = 0;
        while (k < array.length) {
            System.out.print(array[k] + " ");
            k++;
        }
        System.out.println("\nМінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);
        System.out.println("Середнє значення: " + average);
    }
}
