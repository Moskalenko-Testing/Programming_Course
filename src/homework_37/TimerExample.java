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
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 5000; i++) {
            int value = random.nextInt(1001);
            arrayList.add(value);
            linkedList.add(value);



        }



    }

}
