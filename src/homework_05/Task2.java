package homework_05;

public class Task2 {
    public static void main(String[] args) {
        /*
       1.Создайте строки:
        "Java"
        "is"
        "a"
        "powerful"
        "language"
        2.Склейте эти строки двумя разными способами, чтобы получить строку: "Java is a powerful language".
        3.Введите на экран получившуюся строку и её длину.
         */
        String name1 = "Java";
        String name2 = "is";
        String name3 = "a";
        String name4 = "powerful";
        String name5 = "language";


        String result1 = String.join(" ",name1,name2,name3,name4,name5);
        System.out.println("result 1:" + result1);
        System.out.println(result1.length());

        String result2 = name1 + " " + name2 + " " + name3 + " " + name4 + " " + name5;
        System.out.println("result 2: " + result2);
        System.out.println(result2.length());




    }
}
