package lesson_27;

import lists.MyArrayList;
import lists.MyList;

import java.util.Iterator;

public class ForEachExample {
    public static void main(String[] args) {

        MyList<String> list = new MyArrayList<>();

        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Python");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        /*
        forEach
        коллекция - это то что мы перебираем
        for (Тип переменной : коллекция)

         */
        System.out.println("\n======================\n");


        for (String str : list) {

            System.out.println(str);

        }
        System.out.println("\n ================= \n");
        MyList<Integer> integers = new MyArrayList<>();
        integers.addAll(1, 3, 5, 7, 9, 11, 13);

        for (Integer element : integers) {
            System.out.println(element + 100 );
        }
    }
}
