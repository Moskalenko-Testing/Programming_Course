package lesson_42;

import lesson_41.Cat;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamplePart2 {
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
        // task8();
        // task9();
        // task10();
        // task11();
        // task12();
        // task13();
        // task14();
        // task15();
         task16();


    }

    private static void task16() {
        //Преобразовать массив примитов в колекцию, используя стрим

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> integers = Arrays.stream(ints)
                .boxed()
                //.mapToObj(i-> i)
                //.mapToObj(i-> Integer.valueOf(i))
                .collect(Collectors.toList());

        System.out.println("integers = " + integers);

        int[] intArray = integers.stream()
                .mapToInt(i -> i)
                .toArray();
        System.out.println("intArray = " + Arrays.toString(intArray));
    }

    private static void task15() {
        //оПолучить самое маленькое число
        List<Integer> integers = List.of(5, 4, 14, 56, 32, 25, -1, -10, 0);
        Optional<Integer> first = integers.stream()
                .sorted()
                .findFirst();
        int min = first.get();
        System.out.println("min = " + min);
    }

    private static void task14() {
        //Получить список из трех самых маленьких чисел из списка
        List<Integer> integers = List.of(5, 4, 14, 56, 32, 25, -1, -10, 0);

        List<Integer> smallest = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("smallest = " + smallest);

        //Получить список чисел отбросить два самых маленьких
        List<Integer> array = integers.stream()
                .sorted()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println("array = " + array);
    }

    private static void task13() {
        //ПОсчитать количество четных чисел в списке используя стрим
        List<Integer> integers = List.of(5, 4, 14, 56, 32, 25, -1, -10, 0);

        long count = integers.stream()
                .filter(i -> i % 2 == 0 && i != 0)
                .count();

        System.out.println("Количество четных чисел = " + count);

    }


    private static void task12() {
        List<Cat> cats = getListCats();

        //Найти самое длинное имя кота

        Optional<String> longestNameOptional = cats.stream()
                .map(Cat::getName)
                .max((name1,name2)-> name1.length() - name2.length());
        if (longestNameOptional.isPresent()) {
            System.out.println(longestNameOptional.get());
        }else {
            System.out.println("Нет котиков");
        }


    }

    private static void task11() {
        List<Integer> integers = List.of(5, 4, 14, 56, 32, 25, -1, -10, 0);

        //Максимальное отрицательное число

        Optional<Integer> maxOpt = integers.stream()
                .filter(i -> i < 0)
                .max(Comparator.naturalOrder());

        System.out.println("max = "  + maxOpt.orElse(null));

        Optional<Cat> optionalCat = findOptionalCat("Bear");
        System.out.println("optionalCat = " + optionalCat);
        System.out.println("optionalCat.isPresent() = " + optionalCat.isPresent());
        System.out.println("optionalCat.isEmpty() = " + optionalCat.isEmpty());

        if (optionalCat.isPresent()) {
            Cat cat = optionalCat.get();
            System.out.println("Вытащили из optional котика = " + cat.getName());
        } else {
            System.out.println("Там завернут null");
        }
        Cat catDefault = optionalCat.orElse(new Cat("Default", 1, "White"));
        System.out.println("catDefault = " + catDefault);

    }

    private static Optional<Cat> findOptionalCat(String name) {
        List<Cat> cats = getListCats();

        Cat result = null;
        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                result = cat;
            }
        }
        return Optional.ofNullable(result);
    }
    private static Cat findCat(String name) {
        List<Cat> cats = getListCats();

        for (Cat cat : cats) {
            if (cat.getName().equals(name)) {
                return cat;
            }
        }
        return null;

    }

    private static void task10() {
        List<Integer> integers = Arrays.asList(10, 20, 30, 20, 30, 50, 0);

        //Удалить дубликаты из списка
        List<Integer> unique = integers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("unique = " + unique);


        System.out.println("\n====================\n");

        Cat cat = new Cat("Bear", 5, "braun");
        Cat cat1 = new Cat("Python", 7, "green");
        Cat cat2 = new Cat("Tiger", 3, "yellow");
        Cat cat3 = new Cat("Panda", 4, "black");
        Cat cat4 = new Cat("Panda", 4, "black");

        List<Cat> cats = new ArrayList<>(
                List.of(cat, cat1, cat2, cat3, cat4,cat)
        );

        cats.forEach(System.out::println);
        System.out.println();

        cats.stream()
                .distinct()
                .forEach(System.out::println);


    }

    private static void task9() {
        //Создание стрима из маппинга
        Map<String,Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", -10);
        map.put("Cherry", 5);

        //Создание стрима из элементов entrySet
        map.entrySet().stream()
                .filter(entry -> entry.getValue() > 0)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        System.out.println("map = " + map);
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
