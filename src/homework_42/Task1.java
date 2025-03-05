package homework_42;

import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        task1(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
}

    private static void task1(List<Integer> integers) {
        integers.stream()
                .filter(i -> i > 10)
//                .sorted(Comparator.comparing(i -> i % 10))
                .sorted(Comparator.<Integer>comparingInt(i -> i % 10).thenComparing(Comparator.reverseOrder()))
//                .sorted((i1, i2) -> Integer.compare(i1 % 10, i2 % 10))
                .forEach(e -> System.out.print(e + ", "));
        System.out.println();
    }
}