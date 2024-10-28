package homework_08;

public class Task7 {
    public static void main(String[] args) {
        /*
        Дан массив целых чисел. Поменять местами элементы с максимальным и минимальным значениями.
         */
        int[] array = {5, 6, -25, 0, 31, -15};
        System.out.print("Початковий масив: ");
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();

        int minIndex = 0;
        int maxIndex = 0;
        i = 1;
        while (i < array.length) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
            i++;
        }
        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        System.out.print("Масив після обміну: ");
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }
}
