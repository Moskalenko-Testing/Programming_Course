package lesson_07;

public class StringEquals {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println(str1 + " | " + str2 + " | " + " | " + str3);
        boolean b1 = str1 == str2;
        System.out.println("str1 == str2 -> " + b1);//true.Сравнивается значение ссылок.Адрес ""
        System.out.println("str1 == str3 -> " + (str1 == str3));//false

        //Сравнение строк по значению - использовать метод equals
        System.out.println("str1.equals(str2): " + str1.equals(str2));//true
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        //equalsIgnoreCase - сравнение двух строк по значению с игнорированием регистра букв



    }
}
