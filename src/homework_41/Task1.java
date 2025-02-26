package homework_41;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
Task 1
Напишите метод, принимающий список чисел и возвращающий новый, отфильтрованный список.

В новом списке должны быть только те числа из старого списка, которые соответствуют всем условиям: четные, больше 10 и меньше 100

Для фильтрации используйте Stream API
 */
public class Task1 {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 0, 100, -100, 1000);
        List<Integer> integerList = integers.stream()
                .filter(num -> num > 10 && num < 100 && num % 2 == 0)
                .sorted().collect(Collectors.toList());
        System.out.println("integerList = " + integerList);
    }

}

