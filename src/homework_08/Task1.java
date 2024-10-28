package homework_08;

public class Task1 {
    public static void main(String[] args) {
        /*
        Найдите произведение всех чисел от 1 до 10 включительно.
        Результат выведите на экран
         */
        int x = 1;
        int i = 1;

        while (i <= 10) {
            x *=i;
            i++;
        }
        System.out.println("Результат : " + x);
    }
}
