package homework_41;
/*
Task 2
Дан список строк.
Используя Stream API, отфильтруйте строки,
которые начинаются на определенную букву (например, "A") и отсортируйте их в алфавитном порядке.
Результат сохраните в новый список строк.
 */

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        task2();
    }

    private static void task2() {
        List<String> strings = List.of("Abracadabra", "Africa", "Abu-dabi", "Georgia", "Mexico", "Argentina");
        strings.stream()
                .filter(str -> str.startsWith("A"))
                .sorted().forEach(System.out::println);
    }
}




