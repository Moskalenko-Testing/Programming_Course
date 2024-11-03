package lesson_15;

public class CatsMain {
    public static void main(String[] args) {
        Cat cat = new Cat();//создаем обект класса Cat


        cat.sayMeow();
        cat.sleep();
        cat.run();

        String catName = cat.name;
        System.out.println("Имя : " + catName);
        int catAge = cat.age;
        System.out.println("Возраст : " + catAge);

        System.out.println("\n========================\n");
        Cat cat1v = new Cat("Max");
    }
}
