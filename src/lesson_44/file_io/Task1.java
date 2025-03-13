package lesson_44.file_io;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        /*
        Выберите какую-то папку (или создайте новую)
        Создайте в папке 10 файлов с именами:test1.txt, test2.txt, test3.txt, test4.txt, test5.txt, test6.txt, test7.txt, test8.txt, test9.txt, test10.txt
        В каждый файл запишите соответствующую строку: "Java1", "Java2", Java3, Java4, Java5, Java6, Java7, Java8, Java9, Java10

         */
        File task1 = new File("filess");
        System.out.println(task1.mkdir());

        File task2;
        for (int i = 1; i <= 10; i++) {
            try {
                task2 = new File(task1,"test"+i+".txt");
                String s = "Java"+i;
                System.out.println(task2.createNewFile());
                FileWriter fw = new FileWriter(task2);
                fw.write(s);
                fw.close();

                System.out.println(task2.createNewFile());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
