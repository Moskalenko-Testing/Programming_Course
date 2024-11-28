package lesson_22.animals;

public class ZooApp {
    public static void main(String[] args) {


        Cat cat = new Cat();

        cat.eat();
        cat.voice();
        System.out.println(cat.toString());

        System.out.println("\n====================\n");
        Dog dog = new Dog();
        dog.voice();
        System.out.println(dog.toString());

        System.out.println("\n====================\n");
        Hamster hamster = new Hamster();
        hamster.voice();
        System.out.println(hamster);
    }
}
