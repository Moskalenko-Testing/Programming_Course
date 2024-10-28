package homework_05;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        1.Замените в результирующей строке слово "powerful" на "super".
        2.Создайте переменную типа boolean с ответом на вопрос: содержит ли строка подстроку "age"?
        3.Выведите на экран значение этой переменной.
         */
        String name1 = "Java";
        String name2 = "is";
        String name3 = "a";
        String name4 = "powerful";
        String name5 = "language";


        String result1 = String.join(" ",name1,name2,name3,name4.replace("powerful", "super"),name5);
        System.out.println("result 1:" + result1);

        boolean containsAge = result1.contains("age");
        System.out.println("New method : " + containsAge);




    }
}
