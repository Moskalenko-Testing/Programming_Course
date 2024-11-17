package lesson_19;

import java.util.Arrays;
import java.util.Scanner;

public class StringBuilderExample {
    public static void main(String[] args) {

        String str = "Java" + "is" + " " + "the" + " " + "best";

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder("Hello");

        //Метод для добавление в конец строки

        sb1.append(" ");
        sb1.append("World").append("!");

        // Получить стрковое представление(String)

        String string = sb1.toString();
        System.out.println(string);

        sb = new StringBuilder("Hello World");
        sb.insert(6,"beatiful ");
        System.out.println(sb.toString());
        // beatiful вставить в середину строки в 6 индекс
        /*String s = "Hello World";
        String s1 = s.substring(0,6);
        String s2 = s.substring(6);
        */

        //Заменить подстроку(определяется индексами) на указаное значение
        sb = new StringBuilder("Hello World!");
        sb.replace(6,11,"Java");
        System.out.println(sb.toString());

        // Удалить подстроку в диапазоне индексов

        sb = new StringBuilder("Hello World!");
        sb.delete(5,11);
        System.out.println(sb.toString());

        //Реверс - Разворачивает последоватильность символов
        sb = new StringBuilder("Hello World!");
        sb.reverse();
        System.out.println(sb.toString());

        System.out.println("sb.lenght() " + sb.length());

        char ch = sb.charAt(3);
        System.out.println(ch);

        //Получить подстроку по индексу / индексам
        sb = new StringBuilder("Hello World!");
        String subString = sb.substring(1);
        System.out.println(subString);

        subString =sb.substring(6,9);//от start до end (верхняя граница не включительно)
        System.out.println(subString);

        //Изменять размер последовательности символов
        sb = new StringBuilder("Hello");
        System.out.println("sb.length() "+ sb.length());
        sb.setLength(10);
        System.out.println("setLenght(10) " + sb.toString());

        sb.setLength(3);
        System.out.println("setLenght(3) " + sb.toString());

        String example = String.join(" ","Java", "is", "the","best");
        System.out.println(example);
        String[] strings = example.split(" ");

        System.out.println(Arrays.toString(strings));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите несколько слов");
        String text = scanner.nextLine();
        








    }
}
