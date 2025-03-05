package homework_42;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> result = task3(List.of(9, 17, 18 ,33, 22 , 75, 4, 101, 203, 52, 303));

        System.out.println(result);
    }

    private static List<Integer> task3(List<Integer> list) {
        return list.stream()
                .filter(e -> e % 2 == 0)
                .peek(System.out::println)
                .map(i -> i * 2)
                .collect(Collectors.toList());


    }
}

