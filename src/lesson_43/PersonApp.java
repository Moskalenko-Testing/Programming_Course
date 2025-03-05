package lesson_43;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("john@email.com", "qwerty");
        System.out.println(person);

        Person testPerson = new Person("john.email.com", "qwerty");
        System.out.println(testPerson);

        testPerson = new Person("john@ema%il.com", "qwerty");
        System.out.println(testPerson);
    }
}
