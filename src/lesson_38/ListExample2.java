package lesson_38;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,10,100,-5,0,100,11,54));
        // indexOf - первое вхождение
        // lastIndexOf - последнее вхождение
        // sort(Comparator)-
        // List<E> subList()

        System.out.println("list.indexOf : " + list.indexOf(100));
        System.out.println("list.lastIndexOf : " + list.lastIndexOf(100));
        System.out.println("list.indexOf(-10000) : " + list.indexOf(-10000));
        System.out.println("list.indexOf(\"String\") : " + list.indexOf("String"));


        // void sort(Comparator<? super E> comparator) - сортирует список с использованием указанного компаратора
        list.sort((i1, i2) -> i2 - i1);

        System.out.println("list: " + list);

        list.sort(Integer::compareTo);

        System.out.println(list);
       //List<E> subList() - возвращает список из элементов,находящихся на показанном диапазоне от indxFrom to INdxTo

        List<Integer> subList = list.subList(1, 5);

        System.out.println(subList);


    }

}
