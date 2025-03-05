package lesson_43;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class ExceptionExample {
    public static void main(String[] args) {

        int[] array = {1,23,4};

        try {
            array[10]=10;
        } catch (Exception ex) {
            System.out.println("Что то пошло не так" + ex.getMessage());
        }
        System.out.println("Программа продолжает работу");


    String result = getUrl();
        System.out.println(result);

        String url2 = null;
        try {
            url2 = getUrl2();
        } catch (MalformedURLException e) {
            System.out.println("Неверный формат URL");
            System.out.println(e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("Блок finally");
        }

        System.out.println("Пытаемся получить URL2: " + url2);
    }
        private static String getUrl2() throws MalformedURLException {

        URL myUrl = new URL("https://example.com");
        return myUrl.toString();

    }
    private static String getUrl(){
        URL myUrl = null;
        String defaultString = "https://google.com";


        try {
            myUrl = new URL("htps://example.com");
        } catch (MalformedURLException e) {
            System.out.println("Неверный формат URL: " + e.getMessage());;
            return defaultString;
        }

        return myUrl.toString();
    }
}
