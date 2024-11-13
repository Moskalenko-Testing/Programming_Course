package lesson_18;

public class CarApp {
    public static void main(String[] args) {

        System.out.println("Статическое поле до создание обьекта");
        System.out.println(Car.totalCars);

        Car car = new Car("BMW",200);

        System.out.println(car.toString());
        System.out.println("\n===============\n");

        Car vw = new Car("VW",300);

        System.out.println(car.toString());
        System.out.println(vw.toString());

        System.out.println("Static var : " + Car.totalCars);


        //System.out.println("Static var : " + vw.totalCars);

    }
}
