package homework_06;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        /*
        Создайте две переменные типа int.
        В первую переменную запишите случайное значение от 0 до 50.
        Во вторую переменную случайное значение от 0 до 100.
        (опционально) Во вторую переменную случайное значение от -20 до 30.
        Проверьте:
        равны ли переменные,
        не равны ли они,
        больше ли a, чем b,
        и меньше ли b, чем a.
        Выведите результат на экран.
         */
        Random random = new Random();
        int randa = random.nextInt(51);
        int randb = random.nextInt(101);
        int min = -20;
        int max = 30;
        int rand1 = random.nextInt((max - min)+1) + min ;

        boolean b1 = randa == randb;
        System.out.println("Result equality : " + b1);
        boolean b2 = randa != randb;
        System.out.println("Result  not equality : " + b2);
        boolean b3 = randa > randb;
        System.out.println("Result more : " + b3);
        boolean b4 = randb < randa;
        System.out.println("Result less : " + b4);




    }
}
