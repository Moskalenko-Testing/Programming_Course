package homework_08;

public class Task2 {
    public static void main(String[] args) {
        /*
        Используйте цикл while для решения задачи:
        Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
         */
        int i = 1;

        while (i <= 10) {
            System.out.print("\"Task" + i +  "\"");
            if (i < 10) {
                System.out.print(", ");
            }
            i++;
        }
    }
}
