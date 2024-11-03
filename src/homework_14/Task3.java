package homework_14;

import java.util.Scanner;

public class Task3 {
    /*
    Task 3
    Подсчет гласных и согласных
    Напишите программу, которая просит пользователя ввести слово и подсчитывает
    количество гласных и согласных букв в этом слове.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово");
        String input = scanner.nextLine();
        String cyr = "аеоуюия";
        calculateCharter(input);



    }
    public static void calculateCharter(String text){
        int vowels = 0;
        int consonanrs = 0;

        String vowelsList = "AEIOUaeiou";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch))

            if (vowelsList.indexOf(ch)>=0){
                vowels++;
            }else {
                consonanrs++;
            }
        }
        System.out.println("Гласные : " + vowels);
        System.out.println("Согласные : " + consonanrs);
    }

    }
