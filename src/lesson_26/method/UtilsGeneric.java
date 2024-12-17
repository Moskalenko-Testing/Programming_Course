package lesson_26.method;

import lists.MyArrayList;
import lists.MyList;

public class UtilsGeneric {

    public static <T> String printArray (T[] array){
        if (array == null || array.length == 0 ) return "[]";


        StringBuilder stringBuilder = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            stringBuilder.append(i < array.length - 1 ? ", " : "]" );
        }
        return stringBuilder.toString();
    }

    // Метод меняющий местами два элементыа любого типа по индексам
    public static <T> void swap(T[] array, int ind1, int ind2) {
        T temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    // Написать метод , который считает сумму элеметов в массиве
    public static <T extends Number> double sum(T[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            sum += element.doubleValue();
        }
        return sum;
    }
    public static <T extends Number> int sumInt(T[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            T element = array[i];
            sum += element.intValue();
        }
        return sum;
    }

    // Метод, который принимает объект MyList только с элементами типа Number или его наследниками

    public static <T extends Number>  double listSum(MyList<T> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).doubleValue();
        }
        return sum;
    }

    // Ограничения снизу (Lower Bounds)
    // <? super X> - Мы работаем с неизвестным типом, который является классом Х или его родителем (супер-классом)

    // Integer, Number, Object
    // Метод принимает MyList с элементами типа Integer или его предками

    public static void addNumbers(MyList<? super Integer> list) {
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
    }

    //PECS
    // Product Extends, Consumer Super


}



