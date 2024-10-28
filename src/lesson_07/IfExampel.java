package lesson_07;

import java.util.Random;
import java.util.Scanner;

public class IfExampel {
    public static void main(String[] args) {
        int x = 8;

        /*
        1.if (условие) оператор;

        2.if(условие) оператор
        else оператор;

        3.if (условие 1) оператор
        else if (условие 2) оператор
        else оператор;
         */
        if (x > 11) {
            System.out.println("Всем привет !");
            System.out.println("Сейчас Х равен : " + x);
        } else if (x > 7) {
            System.out.println("Мы находимся в блоке ELSE IF");
            System.out.println("Сейчас Х равен : " + x);

        } else {
            System.out.println("Мы находимся в блоке ELSE");
            System.out.println("Сейчас Х равен : " + x);
        }
        System.out.println("Продолжение программы");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число 1 или 10 ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number == 1) {
            System.out.println("Вы ввели число 1");
        } else if (number == 10) {
            System.out.println("Вы ввели число 10");
        } else {
            System.out.println("Вы ввели не верное число !!! ");
        }


            int money = 100;
            int note;

            System.out.println("Какую оценку получил ребенок? ");
            note = scanner.nextInt();
            scanner.nextLine();

            if(note == 5){
                money +=20;
            }else if (note == 4){
                money +=10;
            }else if (note == 3 ){

            }else if (note == 2){
                money -=10;
            }else if (note == 1){
                money = 0;
            }else {
                System.out.println("Таких чисел не бывает");
            }
            System.out.println("У ребенка сейча денег : " + money);

            System.out.println("============ Поиск минимального значение");
            Random random = new Random();
            int v1 = random.nextInt(51);
            int v2 = random.nextInt(51);
            int v3 = random.nextInt(51);

        System.out.println(v1 + "|" + v2 + "|" + v3);
        int min = v1;
        if(v2<min){
            min=v2;
        }
        if (v3<min) min = v3;
        System.out.println("Минимальное значение : " + min);



        }
    }
