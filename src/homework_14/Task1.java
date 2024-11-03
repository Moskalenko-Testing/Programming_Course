package homework_14;

public class Task1 {
    /*
    Task 1
    Сумма четных чисел
    Напишите метод, который вычисляет сумму всех четных чисел в массиве.
     */
    public static void main(String[] args) {
        int[] array = {0, 1, 3, 4, 6, 5, 10};
        int sum = sumOfEvenNumbers(array);
        System.out.println("Сума четных чисел в массиве : " + sum);
    }

    public static int sumOfEvenNumbers(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}


