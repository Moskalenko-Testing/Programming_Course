package homework_09;

public class Task5 {
    public static void main(String[] args) {
        /*
        Написать метод, который принимает массив строк.
        Вывести на экран все символы самой длинной строки из массива.
         */
        String [] strings = { "One", "Two", "Twenty" };
        arrayStringCount(strings);
    }

    public static void arrayStringCount(String[] strings) {
        int longestIndex = 0;

        int maxLength = strings[0].length();

        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() > maxLength) {
                maxLength = strings[i].length();
                longestIndex = i;
            }
        }

        System.out.println("Самая длинная строка : " + strings[longestIndex]);
        System.out.println("Символы самой длинной строки:");

        for (int j = 0; j < strings[longestIndex].length(); j++) {
            System.out.print(strings[longestIndex].charAt(j) + " ");
        }
        System.out.println();
    }
}


