package homework_25.MagicArrayGen;

public class MagicArrayGeneric <T> {
    private Object[] array;
    private int cursor; // присвоено значение по умолчание - 0;

    public MagicArrayGeneric() {

        array = (T[]) new Object [10];
    }

    public MagicArrayGeneric(T[] ints){
        if (ints != null){
            this.array = (T[]) new Object[ints.length * 2];
            addAll(ints);
        }else {
            this.array = (T[])new Object[10];
        }
    }

    // Добавление в массив одного элемента
    void add(T value) {

        // Проверка. Есть ли свободное места во внутреннем массиве
        // Если места нет - нужно добавить место
        if (cursor == array.length - 1) {
            // Курсор указывает на последнюю свободную ячейку
            // Расширить массив перед добавлением нового элемента
            expandArray();
        }

        array[cursor] = value;
        cursor++;
    }

    // Динамическое расширение массива
    void expandArray() {
        System.out.println("Расширяем массив! cursor: " + cursor);
        /*
        1. Создать массив бОльшего размера (в 2 раза больше)
        2. Переписать в новый массив все значения из старого (до курсора)
        3. Перебросить ссылку
         */

        // 1.
        T[] newArray = (T[]) new Object[array.length * 2];

        // 2
        for (int i = 0; i < cursor; i++) {
            newArray[i] = (T) array[i]; // Переписываю все значения из старого массива
        }

        // 3. Перебрасываем ссылку. Переменная array хранила ссылку на "новый" массив
        array = newArray;
        System.out.println("Расширение массива завершено");
    }


    void addAll(T... values) {
        // с values я могу обращаться точно также, как со ссылкой на массив int
//        System.out.println("Мы приняли несколько int-ов. А именно: " + values.length);
//        System.out.println("У каждого значения есть индекс. По индексом 0: " + values[0]);

        for (int i = 0; i < values.length; i++) {
            add(values[i]);
        }
    }

    // Удаление элемента по индексу
    public Object remove(int index) {
        /*
        1. Проверить валидность индекса (что он не отрицательный и меньше курсора
        2. Запомнить, какое значение находилось под этим индексом
        3. Удалить значение из ячейки
        4. Передвинуть все элементы за индексом на 1 ячейку влево
        5. Передвинуть курсор влево
        6. Вернуть старое значение
         */

        if (index < 0 || index >= cursor) {
            // Индекс не валидный. Ничего в массиве не трогаем
            return Integer.MIN_VALUE; // Todo переписать потом
        }

        // 2. Запомнить значение
        T value = (T) array[index];
        // 3, 4
        // индекс 11, курсор = 12
        //for (int i = 11; i <  12 - 1; i++) {
        for (int i = index; i < cursor - 1; i++) {
            array[i] = array[i + 1];
        }
        // 5.
        cursor--;

        return value;
    }

    // Текущее количество элементов в массиве
    public int size() {

        return cursor;
    }

    // Возвращает строковое представление массива
    // [100, 200, 500]

    public Object get(int index) {
        if (index >= 0 && index < cursor) {
            return (T) array[index];
        }
        return Integer.MIN_VALUE;// TODO поправить обработку

    }

    public int indexOf(T value) {
        for (int i = 0; i < cursor; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;

    }

   public Object set(int index, T newValue){
        if (index < 0 ||index >= cursor){
            return Integer.MIN_VALUE;// TODO поправить обработку
        }
        T oldValue =(T) array[index];
       array[index]= newValue;
        return oldValue;
    }

    boolean removeByValue(T value) {
        int index = indexOf(value);

        if (index == -1)
            return false;

        remove(index);
        return true;


    }


    public String toString() {
        /*
        Открыть скобочку.
        Перебрать элементы.
        Добавить каждый элемент, добавить запятую (если элемент не последний)
        Закрыть скобочку
         */

        if (cursor == 0) return "[]";

        String result = "[";
        for (int i = 0; i < cursor; i++) {
            result = result + array[i] + ((i < cursor - 1) ? ", " : "]");
        }
        return result;
    }

}
/*
1. Добавлять в массив элементы (не думаю об индексах, размере массива) ++
2. Динамическое изменение размера массива ++
3. Возвращать строковое представление массива (какие элементы там есть) ++
4. Добавляем в массив сразу несколько значений ++
5. Текущее количество элементов в массиве ++
6. Возвращает значение по индексу get(int index) ??
7. Удалять элемент по индексу (Если индекс есть - удалит элемент - вернет удаленное значение) ++
8. Поиск элемента по значению indexOf(int value) (определить есть ли в массиве элемент с таким значением) ??
9. Удалять элемент по значению boolean removeByValue(int value) (Если значение есть - удалит элемент - вернет true, если такое значение было) ++
 */
