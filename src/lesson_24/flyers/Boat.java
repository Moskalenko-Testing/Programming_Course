package lesson_24.flyers;

public class Boat  extends Transport implements Swimmable {

    public Boat(int capacity) {
        super(capacity);
    }

    @Override
    void takePassengers() {
        System.out.println("Boat takePassengers");
        capacity++;
    }

    @Override
    public void swim() {
        System.out.println("Boat swimming");
    }
}
