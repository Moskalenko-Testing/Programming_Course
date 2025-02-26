package lesson_41;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
   /*
    Stream API - мощный инструмент, позволяющий обрабатывать наборы данных в декларативном стиле

    Stream (поток) - поток данных представляет собой последовательность элементов.
    Поток дает возможность поочередного получение элемента данных для обработки.
    Стримы могут быть созданы из различных источников (коллекции, массивы и так далее)

    Pipeline - последовательно операций, выполняемых на потоке

    Промежуточные операции (методы) - Это операции, которые преобразуют поток в другой поток (возвращают поток).
    Их может быть много (больше чем одна)

    Терминальные операции (методы) - Это операции, которые запускают обработку потока и закрывают его.
    После выполнения терминальной операции поток перестает быть доступным для дальнейшей обработки.
    Может быть ТОЛЬКО ОДИН терминальный метод

    Ленивые вычисления
    Стримы не выполняют промежуточные операции, пока на потоке не будет вызван терминальный метод.

     */


    /*
    Промежуточные методы:

    Stream<T> filter(Predicate<T> predicate) - оставляет в потоке только те элементы,
    для которых предикат вернет true
    Т.е. Оставляет элементы, удовлетворяющие условию (отбрасывает элементы НЕ удовлетворяющие условию)

    sorted() - сортирует поток в естественном порядке
    sorted(Comparator<T> comparator> - сортирует элементы с использованием компаратора

    Stream<R> map(Function<T, R> action) - преобразует элементы потока с использованием заданной функции,
    в том числе в другой тип данных

    Stream<T> peek(Consumer<T> action) - выполняет действие для каждого элемента потока. Как правило, не изменяющее элемент

     */

    /*
    Терминальные методы

    R collect(Collector<T, A, R> collector) - преобразует элементы потока в разные виды коллекций или другие структуры данных.

    void forEach(Consumer<T> action) - выполняет заданное действие для каждого элемента потока

     */

    public static void main(String[] args) {

        // task1();
        // task2();
        // task3();
        // task4();
        // task5();
        // task6();
        // task7();
         task8();

    }

    private static void task8() {
        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");

        Cat[] cats = {cat, cat1, null,cat2, cat3,new Cat(null,10,"red")};

        //Получить список кошек, имя которых длинее 4

        List<Cat> longCats = Arrays.stream(cats)
                //.filter(c-> c != null)
                .filter(c -> Objects.nonNull(c))
                .filter(c ->  Objects.nonNull(c.getName()))
                .filter(c -> c.getName().length() > 4)
                .collect(Collectors.toList());
        System.out.println("longCats = " + longCats);
    }

    private static void task7() {
        List<Cat> cats = getListCats();

        // Вывести на экран имен котов, у которых вес меньше 5
        // Вывести на экран котов, после фильтрации

        Stream<String> catStream = cats.stream()
                .filter(cat -> cat.getWeight() < 5)
                .peek(cat -> System.out.println("After filter: " + cat))
                .map(cat -> cat.getName());

        catStream.forEach(name-> System.out.println(name));

    }

    private static void task6() {
        //Получить список имен кошек , у которых именаа короче 5 символов
        List<Cat> cats = getListCats();

        List<String> names1 = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println("names1 = " + names1);

        System.out.println("\n====================\n");

        List<String> names2 = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());
        System.out.println("names2 = " + names2);
    }

    private static void task5() {
        List<Cat> cats = getListCats();
        //Получить список имен кошек чей вес больше 4
        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<String> names = catStream
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println("names = " + names);
    }

    private static void task4() {
        List<Cat> cats = getListCats();

        //Список имен всех кошек
        Stream<String> namesStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println("names: " + catNames);
    }

    private static void task3() {
        List<Cat> cats = getListCats();

        //Оставить котов с именем, длинее 4 символов

        Stream<Cat> stream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        List<Cat> longNames = stream.collect(Collectors.toList());
        System.out.println("longNames = " + longNames);

    }

    private static void task2() {
        List<Cat> cats = getListCats();

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<Cat> fatCats = catStream.collect(Collectors.toList());
        System.out.println("fatCats = " + fatCats);

        //List<Cat> fatCats2 = catStream.sorted().collect(Collectors.toList());




    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "braun"),
                new Cat("Python", 7, "green"),
                new Cat("Tiger", 3, "yellow"),
                new Cat("Panda", 4, "black")
        );
    }

    private static void task1() {

        List<Integer> integers = List.of(-1, 12, 0, 5, 1, -15, 24, 0);
        // Получить список положительных чисел из исходного списка
        //Список должен быть отсортерован по возрастанию

        List<Integer> result = new ArrayList<>();

        for (Integer num : integers) {
            if (num > 0) {
                result.add(num);
            }
        }
        result.sort(Comparator.naturalOrder());

        System.out.println("result = " + result);

        // У всех колекций есть метод .stream() создающий поток(стрим) из элементов колекции

        List<Integer> integerList = integers.stream().filter(num -> num > 0).sorted().collect(Collectors.toList());
        System.out.println("integerList = " + integerList);
    }
}
