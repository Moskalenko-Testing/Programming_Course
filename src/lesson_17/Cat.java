package lesson_17;

public class Cat {
    String name;
    int age;
    int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String toString() {
        return "Cat: " + name + ", age: " + age + ", weight: " + weight;
    }
}
