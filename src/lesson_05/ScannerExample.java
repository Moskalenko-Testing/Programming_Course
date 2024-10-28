package lesson_05;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        //Подготовка программы к чтению данных от пользователя

        Scanner scanner = new Scanner(System.in) ;

        // Спросить имя
        System.out.println("Введите ваше имя :");
        String name = scanner.nextLine();

        System.out.println(name +1);

        //Спросить возраст
        System.out.println("Введите ваш возраст");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println(age + 1);

        System.out.println("Введите кол-во детей");
        int children = scanner.nextInt();
        //Обнулить сканер
        scanner.nextLine();
        System.out.println(children);

        //
        System.out.println("Введите double");
        double doubleVar = scanner.nextDouble();
        System.out.println(doubleVar);


    }
}
