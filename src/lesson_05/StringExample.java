package lesson_05;

public class StringExample {
    public static void main(String[] args) {

        String string = "Java";//Обьявление и иннициализация типа String

        String string1 = new String("Hello");//Тоже создание новой строки

        System.out.println(string);

        // Название метода с круглыми скобками - вызов метода
        System.out.println(string.length());// количество символов в строке (длина строки)

        //Метод позволяэт перевести все символ в верхней регистр

        System.out.println(string.toUpperCase());//перевести все символы в верхней регистр
        System.out.println(string);

        //String - иммутабельна(неизминяемая)

        String string2 = string.toUpperCase();
        System.out.println("string2: " + string2);
        System.out.println("string: " + string);

        System.out.println("++++++++++++++++++++++++++");

        String str1 = "One";
        String str2 = " ";
        String str3 = "hello";

        //Различие варианты склеевание / обединение строк
        //Конкатенация строк/ обьядинение строк

        String concatStr = str1 + str2 + str3 + "!!!";
        System.out.println(concatStr);

        String concatStr2 = str1.concat(str2);
        concatStr2 = concatStr.concat(str3);
        System.out.println(concatStr2);

        String concatStr3 = str1.concat(str2).concat(str3).concat("???");
        System.out.println(concatStr3);

        //
        String concatStr4 = String.join(" ",str1,str3, "!!!");
        System.out.println("concatStr4: " + concatStr4);

        System.out.println("============================");

        // Прививдение типов
        // Когда есть строка знак +, знак конкатинации и все операнты (учасники операции) преобразуються к строке
        int a = 1;// "1"
        int b = 2;
        String string3 = "Hello";
        // Приоритет операций мы можем задавать скобками
        System.out.println(string3 + a + b);

        String digits = "0123456789";
        String digits2 = "9876543210";


        char firstChar = digits.charAt(0);//Взять символ под индексом (номером) 0 из строки digits
        char firstChar2 = digits2.charAt(0);//Взять символ под индексом (номером) 0 из строки digits
        System.out.println("first from digits: " + firstChar);
        System.out.println("first from digits2: " + firstChar2);

        // Независимо от фактической длинны строки
        char lastChar = digits.charAt(digits.length() - 1);
        System.out.println("last from digits: " + lastChar);

        System.out.println("==========Substring====================\n");

        String subString = digits.substring(2);//Выделить подстроку начиная с индекса 2 до конца строки
        System.out.println("digits.substring(2): " + subString);
        System.out.println("digits : " + digits);
        subString = digits.substring(2,7);// Взять подстроку от индекса 2 включительно до индекса 7 не включительно


        System.out.println("====================Replace=================\n ");
        String string4 = "OneTwoOneTwoThree";
        String replace = string4.replace("One","Stop");//Заменить все найдение строки "One" на "Stop"
        System.out.println("replace: " + replace);
        replace = string4.replaceFirst("One", "Stop");
        System.out.println("replaceFirst: " + replace);
















    }
}
