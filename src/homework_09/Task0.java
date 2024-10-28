package homework_09;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
        /*
        Написать метод, принимающий на вход строку. Метод должен вывести на экран число, соответсвующее количеству символов в строке.
        Например: Если в метод пришла строка "hello" - метод должен вывести число 5 (так как в строке hello 5 символов)
         */
        String hello = "Hello";

        printStringCount(hello);
    }

    public static void printStringCount(String string) {
        System.out.println(string.length());
    }
}
