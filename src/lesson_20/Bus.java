package lesson_20;

public class Bus  extends Vehicle {

    private int capacity;
    private int countPassengers;

    public Bus(String model, int year, int capacity){
        super(model, year);
        this.capacity = capacity;

    }

    public int getCapacity() {
        return capacity;
    }

    public int getCountPassengers() {
        return countPassengers;
    }
    public boolean takePassengers(){
        if (countPassengers < capacity){
            countPassengers++;
            System.out.println("Пасажир зашел в автобус : " + model);
            return true;
        }
        System.out.printf("В автобусе %s больше нет мест. Сейчас %d пассажиров\n",
                model,countPassengers);
        return false;
    }
    public boolean dropPassengers(){
        if (countPassengers > 0){
            countPassengers --;
            System.out.println("Пасажир вышел из автобуса : " + model);
            return true;
        }
        System.out.printf("В автобусе %s больше нет пассажиров \n",
                model);
        return false;
    }
}
