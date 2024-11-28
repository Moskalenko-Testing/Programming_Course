package homework_22.human;

import lesson_17.persons.Person;

public class HumanApp {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println("Человек : ");
        human.run();

        System.out.println("\n=======================\n");


        AmateurAthlete amateurAthlete = new AmateurAthlete();
        System.out.println("Спортсмен-любитель : ");
        amateurAthlete.run();

        System.out.println("\n=======================\n");

        AmateurPro amateurPro = new AmateurPro();
        System.out.println("Спортсмен-профи : ");
        amateurPro.run();

    }
}
