package homework_06;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        1.Попросите пользователя ввести целое число с клавиатуры.
        2.Ваша программа должна вывести строку в формате:
        Число: 6 четное: true; кратно 3: true; четное и кратное 3: true
        Число: 3 четное: false; кратно 3: true; четное и кратное 3: false
         */
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Введите целое число : ");
        int number = scanner.nextInt();
        scanner.nextLine();


        boolean isEven = number % 2 == 0;
        boolean isMultipleOf3 = number % 3 == 0;
        boolean isEvenAndMultipleOf3 = isEven && isMultipleOf3;


        System.out.println("Число: " + number +
                " четное: " + isEven +
                "; кратно 3: " + isMultipleOf3 +
                "; четное и кратно 3: " + isEvenAndMultipleOf3);
    }
}




