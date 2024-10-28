package lesson_08;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {


        //int array1[];// Альтернатвный способ обявления массива и он не рекомендуется использовать.
        int[] array;// Обявление переменной
        String[] strings;

        array = new int[4];// Создание(инициализации массивов типа int с 4 ячеечками)
        strings = new String[10];// Создание массивов строк с 10 ячеечками


        int[] array2 = new int[8];// Обявили и инициализировали массив int на 8 ячеек

        //Обращение к элементу массиву по индексу(номеру ячейки)
        int value = array2[0];
        System.out.println("array2[0] : " + value);
        System.out.println("strings[2] : " + strings[2]);

        System.out.println("\n===================== ");

        int[] numbers = new int[] {45,56,-16,45,0,259,1444}; // явная инициализация массива
        int length = numbers.length; // длинна массива(количество ячеек / элементов в массиве)
        System.out.println("length : "  + length);

        int[] ints = {-10,54,32323,444}; // явная инициализация массива

        System.out.println("В 0 ячейке массива numbers находится число : " + numbers[0]);
        System.out.println("В 0 ячейке массива ints находится число : " + ints[2]);
        System.out.println("В 0 ячейке массива strings находится число : " + strings[9]);

        System.out.println(ints); //Получим визуализируваную ссылку на адрес в памяти () где находиться наш массив

        System.out.println("\n==================================");
        System.out.println("Распечатываем массив ints");
        int i = 0;
        while (i<ints.length){
            System.out.print(ints[i] + ", ");
            i++;
        }
        System.out.println();

        //[1,3,5,6,7]
        System.out.println("\n========= Распечатываем массив красиво =========");
        String arrayToString = "[";
        while (i<numbers.length){
            arrayToString += numbers[i];// Приклееваем текущее значение из массива

            if (i != numbers.length - 1){
                arrayToString += ", ";
            }else {
                arrayToString +="]";
            }
            i++;
        }
        System.out.println(arrayToString);

        System.out.println("\n=========== Присвоение значений элемента массива =========");
        int[] numbers2 =new int[10];

        numbers2[2] = 10; //Присвоение нового значения элементу массива с индексом 2

        //Заполнить массив случацнными числами в диапазоне от 0 до 100
        Random random = new Random();

        int k = 0;
        System.out.print("[");
        while (k<numbers2.length){
            numbers2[k]= random.nextInt(101);
            System.out.print(numbers2[k] + ", ");
            k++;
        }
        System.out.println("]\n");

        System.out.println("\n ====== Поиск минимального значения в массиве ======= ");
        i = 0;
        int min  = numbers2[0];
        while (i < numbers2.length){
            if (numbers2[i]< min){
                min =numbers2[i];
            }
            i++;
        }
        System.out.println("Минимальное значение в массиве : " + min);
        


    }
}
