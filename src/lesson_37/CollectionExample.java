package lesson_37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        //Интерфейс Collection гарантирует наличие базовых методов для всех расширяющих его интерфейсов
        //Создаем коллекцию строк
        // Ссылка типа Interface -> набор доступных методов + ссылка на объект какого класса может хранить эта переменная
        //Справа мы можем подставить объект разных классов (получить разные реализаци этого интерфейса)
        Collection<String> strings = new ArrayList<>();

        // int size() - возвращает количество элементов в коллекции
        System.out.println("strings.size() : " + strings.size());

        //boolean isEmpty() - возвращает true, если коллекция пуста, иначе false
        System.out.println("strings.isEmpty() : " + strings.isEmpty());

        //boolean add(T t) - добавляет элемент в коллекцию
        strings.add("Java");
        System.out.println("strings.add(\"Java\") : " + strings.add("Python"));

        //Переопределенный метод toString() - возвращает строковое представление всех элементов коллекции
        System.out.println("strings.toString() : " + strings);

        //Метод .of() - возвращает новую коллекцию, заполненную данными.Он создает неизменяенный экземпляр коллекции
        Collection<Integer> integers = List.of(0, 1, 2, 3, 4, 5, 6);
        System.out.println("integers : " + integers);

        //addAll(Collection<? extends T> c) - добавляет все элементы из указанной коллекции в текущую коллекцию
        strings.addAll(List.of("JS", "Go Lang","Ruby"));
        System.out.println("strings.addAll : " + strings);

        System.out.println("==========================\n");

        //removeAll(Collection<?> col) - удаляет все элементы содержащиеся коллекции col  из коллекции вызова
        Collection<Integer> numbers = new ArrayList<>();
        numbers.addAll(List.of(0, 1, 2, 3, 4, 5));
        System.out.println("numbers : " + numbers);
        numbers.removeAll(List.of(3,2,1));
        System.out.println("numbers.removeAll(List.of(3,2,1)) : " + numbers);
        System.out.println("==========================\n");

        //retainAll(Collection<?> col) - оставляет в коллекции вызова только те элементы, которые содержаться в коллекции col.
        //Удаляет из колекции вызова элементы , которые не содержаться в коллекции col
        // [3,3,2,2,1] retainAll([3,2]) -> [3,3,2,2]
        Collection<Integer> colA = new ArrayList<>();
        Collection<Integer> colB = new ArrayList<>();
        colA.addAll(List.of(10,20,30,20,40,50,60));
        colB.addAll(List.of(20,30,40));
        System.out.println("colA : " + colA);
        System.out.println("colB : " + colB);
        colA.retainAll(colB);
        System.out.println("colA.retainAll(colB) : " + colA);

        //boolean remove(Object obj) - удаляет первое вхождение элемента obj из коллекции. Если такого элемента нет, возвращает false
        System.out.println("colA.remove(100) : " + colA.remove(100));
        System.out.println("colA.remove(20) : " + colA.remove(20));
        System.out.println("colA : " + colA);

        // clear() удаляет все элементы из коллекции
        colA.clear();
        System.out.println("colA: " + colA);


    }
}
