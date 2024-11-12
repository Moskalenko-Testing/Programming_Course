package lesson_17;

public class CatApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Catty", 8, 5);

        System.out.println(cat.toString());

        System.out.println(cat.name);

        cat.age = -1000;
        cat.weight = 1500;
        cat.name = null;

        System.out.println(cat.toString());
    }
}
