package homework_09;

public class Task1 {
    public static void main(String[] args) {
        /*
        Написать метод, принимающий массив целых чисел и распечатывающий массив в обратной последовательности.

        {1, 4, 3, 6, 7} -> распечатывает [7, 6, 3, 4, 1]

        Перегрузить метод, если в него приходит индекс,
        то часть массива слева до этого индекса распечатывается в обычном порядке, а начиная с этого индекса в обратном:

        {1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]

        Еще одна перегрузка: метод принимает массив и булевый флаг.
        Если флаг == true -> печатает массив в обратном порядке
        Если флаг == false -> печатает массив в прямом порядке

         */
                int[] array = {1, 4, 3, 6, 7};
                printReverseArray(array, 2);

                System.out.println("\nprintReverseArray(array);");
                printReverseArray(array);

                System.out.println("\nprintReverseArray(array, true): ");
                printReverseArray(array, true);

                System.out.println("\nprintReverseArray(array, false): ");
                printReverseArray(array, false);


            }

            public static void printReverseArray(int[] array, boolean flag) {
                if (flag) {
                    printReverseArray(array);
                } else {
                    printReverseArray(array, array.length - 1);
                }
            }

            public static void printReverseArray(int[] array) {
                printReverseArray(array, 0);
            }

            public static void printReverseArray(int[] arr, int index) {
                System.out.print("[");
                int i = 0;
                while (i < index) {
                    System.out.print(arr[i]);
                    if (i < index - 1) {
                        System.out.print(", ");
                    }
                    i++;
                }

                int j = arr.length - 1;
                while (j >= index) {
                    System.out.print(arr[j]);
                    if (j > index) {
                        System.out.print(", ");
                    }
                    j--;
                }

                System.out.println("]");


            }

}





