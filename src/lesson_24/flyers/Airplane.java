package lesson_24.flyers;

public class Airplane extends Transport implements Flyable{

    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    void takePassengers() {
        System.out.println("Airplane takePassengers");
        capacity ++;
    }

    @Override
    public void fly() {
        System.out.println("Airplane flying");
    }
}
