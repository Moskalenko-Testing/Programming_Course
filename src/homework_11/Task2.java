package homework_11;

public class Task2 {
    /*
    Task 2
     Написать метод, который находит среднее значение элементов в массиве (среднее арифметическое).
     */
    public static void main(String[] args) {

        double [] array ={134,200,234,23,-134,0,-1};
        double average = SumElementsArray(array)/ array.length;
        System.out.println("Сумма елементов массива : " + (double)average);

    }
    public static double SumElementsArray(double[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

}


