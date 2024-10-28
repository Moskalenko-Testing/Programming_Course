package homework_11;

public class Task1 {
    /*
    Task 1
    Написать метод, который считает сумму всех элементов в массиве.
     */
    public static void main(String[] args) {
        int [] array ={0,0,0,4,6,0,0};
        int sum = SumElementsArray(array);
        System.out.println("Сумма елементов массива : " + sum);
    }

    public static int SumElementsArray(int[] array) {
        if (array == null || array.length == 0)
            return 0;

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}
