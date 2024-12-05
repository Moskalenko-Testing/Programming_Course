package lesson_24.interfaces;

public class Journal implements Printale {
    private String name;
    private int number;

    public Journal(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Journal: " + name + " #" + number);
    }

    @Override
    public void defaultMethod() {
        System.out.println("Default method from journal");
    }
}
