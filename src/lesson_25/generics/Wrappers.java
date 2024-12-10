package lesson_25.generics;

public class Wrappers {
    public static void main(String[] args) {

        /* Обертка
        byte - Byte
        short - Short
        int -  Integer
        long - Long
        double - Double
        float - Float
        char - Character
        boolean - Boolean
         */

        // Автоматические приведение типов
        // Автоупаковка и автораспаковка

        Integer wrapperInt = 5;// Автоупаковка примитива int в ссылочный Integer
        System.out.println(wrapperInt);

        int primitiveInt = wrapperInt;//автораспаковка.Из типа Integer автоматически преобразовало значение в примитив int
        System.out.println(primitiveInt);

        int maxValue = Integer.MAX_VALUE;
        System.out.println("maxValue = " + maxValue);
        System.out.println(Integer.MIN_VALUE);

        //Особенности сревнение классов оберток

        Integer a = 127;
        Integer b = 127;
        System.out.println("127 == 127 : " + (a == b));//true
        System.out.println(127 + ". equals( " + 127 + ") : " + a.equals(b));

        Integer c = 128;
        Integer d = 128;
        System.out.println("128 == 128 : " + (c == d));//false
        System.out.println(128 + ". equals( " + 128 + ") : " + c.equals(d));

        Integer c1 = -128;
        Integer d1 = -128;
        System.out.println("128 == 128 : " + (c1 == d1));//true

        //-128 до 127 используется кеширование объектов.

        System.out.println("\n===========================\n");
        // Общие (или схожие) методы, которым оладают классы- обертки
        //1. valueOf() - преобразует строку или примитив в соответствующий объект класса-обертки
        Integer e = Integer.valueOf(127);
        Integer f = Integer.valueOf("127");
        System.out.println( e == f );

        Double dbl = Double.valueOf("154.5");
        System.out.println(dbl + 1);
        //2.parseXXX() - преобразует строку в соответствующий примитив.
        int intParse = Integer.parseInt("456") + 100;
        System.out.println(intParse);
        double d2 = Double.parseDouble("344.56");
        System.out.println(d2 + 200);

        //System.out.println(Integer.parseInt("Rrrrr"));//есл ине получится извлечить значение- будет выброшено исключение(ошибка)

        //3. toString() - возращает строковое представление значения
        String stringNumber = dbl.toString();
        System.out.println(stringNumber + 10);//конкатынация строк, а не операция сложения

        //4. equals - сравнивает два объекта по значению

        //5. xxxValue() Распаковка.Возращает значение объекта как примитивный тип
        Double dbl2 = Double.valueOf(125.67);//Явная / принудительная упаковка
        double dPrimitive = dbl2.doubleValue();//Явная / принудительная распаковка

        //Все числовие обертки наследуются от абстрактного класса Number
        /* Обертка
        byte - Byte
        short - Short
        int -  Integer
        long - Long
        double - Double
        float - Float

         */

        Integer integer = 31844;

        System.out.println(integer.doubleValue());

        short sh = integer.shortValue();
        System.out.println(sh);


        double sum = add(1455343,344.67);
        System.out.println(sum);

        //Переполнение диапазона (также как в примитиве)
        Integer a1 = Integer.MAX_VALUE;
        Integer b1 = 1000;
        a1 += b1;
        System.out.println(a1);



    }

    public static double add(Number number1,Number number2){
        double d1 = number1.doubleValue();
        double d2 = number2.doubleValue();
        return d1 + d2;
    }
}
