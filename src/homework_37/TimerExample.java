package homework_37;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/*
Task 2
Создайте два списка. Один на реализации ArrayList, второй на LinkedList.

Заполните их 5_000 одинаковыми случайными значениями от 0 до 1_000.

Создайте 4 метода, принимающий реализацию интерфейса List.

В первом методе - получение всех значений элементов списка по его индексу
Второй метод - вставка 2_000 новых значений по случайному индексу (диапазон индексов от 0 до размера списка)
Третий метод - удалить 1_000 элементов по случайному индексу. (диапазон индексов от 0 до размера коллекции)
Удалить 1_000 элементов по значению (диапазон случайных значений от 0 до 10_000)
Все методы должны возвращать время, затраченное на выполнение метода в миллисекундах.

Сравните для каждого из списка время выполнения каждого метода.

И сравните время последовательного выполнения всех методов для каждой реализации List-а.
 */
public class TimerExample {
    private static final int Capacity = 5000;
    private static final int Bound = 1000;
    private static final int Insert_Count = 2000;


    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < Capacity; i++) {
            int value = random.nextInt(Bound + 1);
            arrayList.add(value);
            linkedList.add(value);


        }

        System.out.println("arrayList.size() : " + arrayList.size());
        System.out.println("linkedList.size() : " + linkedList.size());

        long start = System.currentTimeMillis();
        arrayList.contains(2000);
        long end = System.currentTimeMillis();
        System.out.println("time arrayList.contains : " + (end - start));

        start = System.currentTimeMillis();
        linkedList.contains(2000);
        end = System.currentTimeMillis();
        System.out.println("time linkedList.contains : " + (end - start));

        start = System.currentTimeMillis();
        System.out.println("get array : " + getElements(arrayList));
        System.out.println("insert array : " + getInsertElements(arrayList));
        System.out.println("delete by index array : "  + deleteByIndexElements(arrayList));
        System.out.println("delete by value array : " + deleteElementsByValues(arrayList));

        end = System.currentTimeMillis();
        System.out.println("Общее время для arrayList : " + (end - start));

        System.out.println("======================\n");


        start = System.currentTimeMillis();
        System.out.println("get linkedList : " + getElements(linkedList));
        System.out.println("insert linkedList : " + getInsertElements(linkedList));
        System.out.println("delete by index linkedList : " + deleteByIndexElements(linkedList));
        System.out.println("delete by value linkedList : " + deleteElementsByValues(linkedList));

        end = System.currentTimeMillis();
        System.out.println("Общее время для linkedList : " + (end - start));

    }

    public static long getElements(List<Integer> integers) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < integers.size(); i++) {
            int value = integers.get(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long getInsertElements(List<Integer> integers) {

        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < Insert_Count; i++) {
            integers.add(random.nextInt(integers.size()), random.nextInt(Bound + 1));
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long deleteByIndexElements(List<Integer> integers) {
        long start = System.currentTimeMillis();
        Random random = new Random();

        for (int i = 0; i < Insert_Count / 2; i++) {
            integers.remove(random.nextInt(integers.size()));
        }

        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long deleteElementsByValues(List<Integer> integers) {

        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < Insert_Count / 2; i++) {
            integers.remove(Integer.valueOf(random.nextInt(10000 + 1)));
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
}
















