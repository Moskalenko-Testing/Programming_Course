package homework_07;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        Task 1
        Необходимо написать программу, которая предлагает пользователю ввести число на выбор: 1, 2 или 3.
        Программа должна сказать, какое число ввёл пользователь: Один, Два, или Три (текстом)
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1 , 2 или 3");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("Вы ввели число Один");
        } else if (number == 2) {
            System.out.println("Вы ввели число Два");
        } else if (number == 3) {
            System.out.println("Вы ввели число Три");
        } else {
            System.out.println("Вы ввели не верное число !!! ");
        }


    }
}
