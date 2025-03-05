package homework_42;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        task2(List.of("String", "hello", "Java", "World", "LongString"));
        task2(Arrays.asList(null, null));
    }

    private static void task2(List<String> strings) {
        Optional<String> optionalString = strings.stream()
                .filter(Objects::nonNull)
                .min(Comparator.comparing(String::length));

        if (optionalString.isPresent()) {
            System.out.println("min length String: " + optionalString.get());
        } else {
            System.out.println("Строки в списке не найдены");
        }

        System.out.println(optionalString.orElse("Что-то пошло не так"));

        optionalString.ifPresent(string -> System.out.println("ifPresent: " + string));
        // optionalString.ifPresent(System.out::println);

        optionalString.ifPresentOrElse(str -> System.out.println("ifPresentOrElse: " + str),
                () -> System.out.println("ifPresentOrElse: Строк не найдено"));

    }
}

