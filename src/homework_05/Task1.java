package homework_05;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        1.Напишите программу, которая будет просить у пользователя ввести его имя с клавиатуры.
        2.Используя Scanner, сохраните имя в переменную типа String.
        3.Выведите на экран количество символов в имени пользователя.
        4.Создайте две переменные типа char: одна должна хранить первый символ имени, другая — последний.
        5.Выведите на экран десятичный код (код символа в десятичной системе счисления) первого и последнего символа имени.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ваше имя :");
        String name = scanner.nextLine();
        System.out.println(name.length());
        char firstLetter = name.charAt(0);
        System.out.println("first from letter: " + (int) firstLetter);
        char lastLetter = name.charAt(name.length() - 1 );
        System.out.println("last from letter : " + (int) lastLetter);

        
    }
}
