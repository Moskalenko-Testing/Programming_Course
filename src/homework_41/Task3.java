package homework_41;
/*
Используйте Stream API для фильтрации людей,
которые старше определенного возраста и проживают в определенном городе, а затем соберите их в список.
Например, старше 25 лет и проживающих в городе "Berlin"
 */

import lesson_41.Cat;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        task3();
    }

    private static void task3() {
        List<Person> persons = getPeople();

        Stream<Person> personStream = persons.stream()
                .filter(person -> person.getAge() > 25 && person.getCity()
                        .equals("Berlin"));
        List<Person> personStream1 = personStream.collect(Collectors.toList());
        System.out.println("personStream1 = " + personStream1);
    }



    private static List<Person> getPeople() {
        return List.of(
                new Person("John", 25, "New York"),
                new Person("Jane", 30, "London"),
                new Person("Alice", 20, "Berlin"),
                new Person("Alla", 28, "Berlin"),
                new Person("Sam", 30, "Berlin"),
                new Person("Florian", 48, "Berlin"),
                new Person("Mark", 17, "Berlin"),
                new Person("Bob", 35, "Paris"),
                new Person("Charlie", 28, "Tokyo")

        );
    }


}
