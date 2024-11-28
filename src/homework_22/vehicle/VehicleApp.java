package homework_22.vehicle;

public class VehicleApp {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();
        Vehicle motorcycle = new Motorcycle();

        car.startEngine();
        bicycle.startEngine();
        motorcycle.startEngine();

    }
}
