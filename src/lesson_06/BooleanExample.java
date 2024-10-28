package lesson_06;

import java.util.Random;

public class BooleanExample {
    public static void main(String[] args) {

        boolean bol1 = true;
        bol1 = false;

        int x = 10;
        int y = 5;

        // Сравнение на равенство
        boolean b1 = (x==y);//x равен y , это ложь
        System.out.println(x + "==" + y + " -> " + b1);

        //Сравнение на неравенства "!="
        b1 = x!=y;// x неравен y , это правда или true
        System.out.println(x + "!=" + y + " -> " + b1);

        //Больше >
        b1 = x > y;//x больше y , это правда (true)
        System.out.println(x + ">" + y + " -> " + b1);// true

        //Больше или равно ">="
        b1 = x>=y;//x больше или равно y , это правда (true)
        System.out.println(x + ">=" + y + " -> " + b1);// true

        //Меньше  "<"
        b1 = x < y;//false
        System.out.println(x + "<" + y + " -> " + b1);// false

        //Меньше равно "<="
        b1 = x <= y;// false
        System.out.println(x + "<=" + y + " -> " + b1);// false

        String str = "Java is the best the";//Содержит ли эта строка подстроку;
        boolean contains = str.contains("Java");
        //Экранирование символов. Сказать компелятору что этот символ не воспринимать как спецсимвол
        System.out.println("str.contains(\"Java\") = " + contains);

        //indexOf
        int index = str.indexOf("Java");// Индекс начала первого вхождение подстроки в строку.Если не вхожденние - мы получим -1
        System.out.println("Индекс вхождение : " + index);
        contains = index != -1;// Если индекс не равен - 1, то вхождение найдено. Contains будет true.Иначе false
        System.out.println("Contains : " + contains);

        //lastIndexOf
        //Также ищет вхождение подстроки в строку. Но ищет последнне вхождение
        index = str.lastIndexOf("the");
        System.out.println("Индекс последнего вхождение : " + index);


        System.out.println("\n =============Логические операции ================ \n ");

        //Логическое не (NOT) - отрицание "!"
        //Меняет значение ттипа boolean на противоположеное
        boolean b2 = !false;//Получем значение true
        System.out.println("!false : " + !false);

        b2 = !(4==5);//!false -> true
        System.out.println("!(4==5) : " + b2);

        //Составние логические операции - обьединение двух условий
        /*
        Логическая И "&"
        Используется когда нужно чтобы оба условия были истенны
        Если хотя бы в одной части будет false тогда в результате мы получим false
        */
        b2 = true & true;
        System.out.println("true & true : " + b2);
        b2 = (2 < 5) & (11 == 10);//true & false = false
        System.out.println("(2 < 5) & (11 == 10) : " + b2);

        //Введите число от 0 до 100
        int z = 50;
        boolean b3 = z > 0 & z < 100;

        //Логическая или "|"
        //Когда достаточно чтобы хотя бы одно условие было истенно или true

        boolean b4 = true | false;
        b4 = false | false;// false
        System.out.println("false | false : " + b4);
        System.out.println("true | false : " + (true | false));

        //Введите или четное число или число которое делиться на 5 без остатка
        //Четное число - это число , которое делиться на 2 без остатка. Остаток от деление числа на 2 равен 0.

        //Генерация случайного числа (псевдослучайного числа)
        Random random = new Random();
        int rand = random.nextInt(101);//(0 ..... 101-1) -> (0.......100) включительно
        System.out.println("Случайное число : " + rand);

        boolean isEven = rand % 2 == 0;
        boolean isGoodNumber = isEven | (rand % 5 == 0 );
        System.out.println("isEven : " + isEven);
        System.out.println("isGoodNumber : " + isGoodNumber);

        System.out.println("\n========== XOR =============");
        //Логическая исключающая ИЛИ "^"(XOR)
        //Возращает true если две части выражение разные
        boolean b5 = true ^ false;// true
        System.out.println("true ^ false : " + b5);
        b5 = false ^ false;
        System.out.println("false ^ false : " + b5);
        System.out.println("true ^ true : " + (true ^ true));
        System.out.println("false ^ true : " + (false ^ true));

        // Логическая сокращенное И "&&""
        //Выдает true только если обе части выражение равны true
        boolean b6 = false && true;
        System.out.println("false && true: " +b6);
        b6 =(2 > 5) && (11 == 10);

        int a = 10;
        int b = 0;
        //Правая часть НЕ СЧИТАЕТСЯ (не выполняется просчет значения),
        //так как в левой части false и значение переменной b7 не зависит от правой части
        boolean b7 = (b != 0) && (a / b > 0);

        System.out.println("\n================== || =============");

        //Логическое сокращение ИЛИ "||"
        //Выдает true только если обе части выражение равны true
        boolean b8 = true || (a / b >2);
        System.out.println("b8 : " + b8);

        System.out.println("\n=============Приоритет логических операций =============");

        /*
        "!" -> "&" -> "^" -> "|" -> "&&" -> "||"
         */
        System.out.println(true ^ true & false);//true
        System.out.println(true ^ false);//true
        System.out.println(true);//true

        System.out.println("++++++++++++++++++++++");
        boolean aa = true;
        boolean bb = false;
        int cc = 25;
        int qq = 2;
        System.out.println("Задание пример : " + (aa | bb | cc < 100 & !aa ^ qq == 5));























    }
}
