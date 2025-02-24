package homework_07;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Напишите программу с использованием оператора switch:
        Программа просит пользователя ввести число от 1 до 7.
        Если число равно 1, выводим на консоль "Понедельник", 2 — "Вторник" и так далее. Если 6 или 7 — "Выходной".
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1 до 7");
        int x = scanner.nextInt();
        scanner.nextLine();
        switch (x) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходные");
                break;
            default:
                System.out.println("Вы ввели не верное значение");
        }
    }
}
