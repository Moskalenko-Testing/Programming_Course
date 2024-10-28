package homework_05;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        1.Попросите пользователя ввести строку чётной длины с клавиатуры.
        2.Распечатайте два средних символа строки.
         */
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите строчку чётной длины :" );
        String name = scanner.nextLine();

        int index = name.length() / 2 - 1 ;

        System.out.println("" + name.charAt(index) + name.charAt(index +1 ));

    }
}
