package homework_14;

public class Task2 {
    /*
Найти второе по величине число в массиве
Напишите метод, который находит второе по величине число в массиве целых чисел.
     */
    public static void main(String[] args) {
        int[] test = {7, 9, 6, 5, 8, 10, 3, 10};

        int second = SecondMaxValue(test);
        System.out.println("secondMax : " + second);
    }

    public static int SecondMaxValue(int[] array) {
        if (array == null || array.length == 0) {
            return Integer.MIN_VALUE;
        }

        int max = array[0];
        int secondMax = array[0];

        for (int i = 0; i < array.length; i++) {
            int num = array[i];

            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }


        return secondMax;
    }
}
