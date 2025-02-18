package lesson_38;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        // Конструкторы

        Set<Integer> set = new HashSet<>();//Создает пустой хеш-сет емкостью 16 и коэффициентом загрузки 0.75.
        set = new HashSet<>(20);//Создает пустой хеш-сет емкостью 20 и коэффициентом загрузки 0.75.
        //Принимает колекцию - создает новый сет, содержащий уникальные элементы из указанной коллекции.
        set = new HashSet<>(List.of(1, 2, 3, 5, 6, 6, 6, 6, 5, 3, 0));

        System.out.println("Set : " + set);


        List<Integer> startValues = new ArrayList<>(List.of(15, 1, 2, 3, 4, 3, 8, 6, 15, 7, 0, 16, 32));
        System.out.println(startValues);

        // HashSet - не поддерживает порядок добавления элементов
        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println(integers);

        //
        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println(linkedSet);


        //Методы интерфейса Set

        //boolean add(E e) - добавляет элемент в коллекцию
        System.out.println("integers.add : " + integers.add(100));
        System.out.println(integers);
        System.out.println("integers.add #2 : " + integers.add(100));// false - элемент уже есть в коллекции
        System.out.println(integers);

        //boolean remove(Object o) - удаляет элемент из коллекции
        System.out.println("integers.remove : " + integers.remove(100));
        System.out.println(integers);

        //boolean contains(Object o) - проверяет наличие элемента в множестве
        System.out.println("integers.contains : " + integers.contains(100));
        System.out.println("integers.contains : " + integers.contains(32));

        /*
        int size()
        isEmpty()
        clear()
         */

        // iterator() - возвращает итератор для элементов set-а
        //Наличие итератора позволяет перебрать все элементы циклом for-each

        for (Integer value : integers) {
            System.out.print(value+ ", ");
        }
        System.out.println();

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.print(value + ", ");
        }
        System.out.println();

        //Убрать дубликаты
        //Написать метод, который принимает список и возращает список
        //состоящий только из уникальных элеметво начального списка

        System.out.println("=====================\n");
        System.out.println(startValues);
        List<Integer> resultList = getUniqueList(startValues);
        System.out.println(resultList);


        System.out.println("=====================\n");

        //SortedSet Конструкторы
        // Пустой = Конструктор по умолчанию - естественная сортировка
        SortedSet<Integer> sortedSet = new TreeSet<>();//пустое, упорядоченное множество.Сортировка в естественном порядке
        sortedSet.add(100);
        sortedSet.add(32);
        sortedSet.add(150);
        sortedSet.add(125);
        System.out.println("sortedSet : " + sortedSet);

        //Конструктор с компаратором, определяющим порядок хранение элементов
        SortedSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.addAll(startValues);
        treeSet.add(10);
        System.out.println(treeSet);

        treeSet = new TreeSet<>((i1, i2) -> i2 - i1);
        treeSet = new TreeSet<>((i1, i2) -> Integer.compare(i2, i1));
        treeSet.addAll(startValues);
        System.out.println(treeSet);


        //first() - возвращает первый элемент множества(самый левый элемент)
        System.out.println("first() : " + treeSet.first());

        //last() - возвращает последний элемент множества(самый правый элемент)
        System.out.println("last() : " + treeSet.last());

        //SortedSet<E> headSet(E fromElement) - возвращает часть множества, элементы которого строго меньше, чем fromElement
        SortedSet<Integer> headSet = treeSet.headSet(8);
        System.out.println("treeSet.headSet : " + headSet);

        //SortedSet<E> tailSet(E fromElement) - возвращает часть множества, элементы которого строго больше или равны, чем fromElement
        SortedSet<Integer> tailSet = treeSet.tailSet(8);
        System.out.println("treeSet.tailSet : " + tailSet);

        //comparator() - возвращает компаратор, используемый для сортировки элементов
        // вернет null, если используется естветсвенные порядок

            test();

    }
    private static void test(){
        String testStr = "Тестовая строка, со словами!";
        //Заменить все не буквы на пустоту
        String newStr = testStr.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");
        System.out.println("newStr : " + newStr);
      //Преобразовать строки в массиве слов
        String[] words = newStr.split(" ");
        System.out.println(Arrays.toString(words));

        //Arrays.asList(T[] array) - преобразует массив в список
        List<String> wordsList = Arrays.asList(words);
        System.out.println(wordsList);
    }

    private static <T> List<T> getUniqueList(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);


    }
}
