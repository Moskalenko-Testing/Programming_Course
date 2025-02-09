package lesson_36;

import java.util.Arrays;
import java.util.Comparator;

public class ComporatorApp {
    public static void main(String[] args) {
        int[] ints = new int[]{9, 5, 1, 5, 2, 0, 15, 10};
        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        Car[] cars = new Car[6];
        cars[0] = new Car("Alfa Romeo", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("VW", 2021, 250);
        cars[4] = new Car("Ferrari", 2024, 300);
        cars[5] = new Car("Ferrari", 2021, 250);

        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

        System.out.println("===================================\n");
        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
        Arrays.sort(cars, carSpeedComparator);
        System.out.println(Arrays.toString(cars));

        System.out.println("===================================\n");
        Arrays.sort(cars, new CarModelCompaarator());
        System.out.println(Arrays.toString(cars));

        System.out.println("===================================\n");

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                return car1.getModel().compareTo(car2.getModel());
            }
        });
        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car c1, Car c2) {
                int yearCompare = c1.getYear() - c2.getYear();
                if (yearCompare != 0) {
                    return yearCompare;
                } else {
                    return c2.getModel().compareTo(c1.getModel());
                }
            }
        });

        System.out.println(Arrays.toString(cars));

        System.out.println("===================================\n");

        Arrays.sort(cars, new Comparator<Car>() {

            @Override
            public int compare(Car c1, Car c2) {
                return c2.getYear() - c1.getYear();
            }
        });

        System.out.println(Arrays.toString(cars));



        System.out.println("===================================\n");
        Arrays.sort(cars, (c1,c2) -> {
            return c2.getYear() - c1.getYear();
        });

        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars, (c1,c2) -> c2.getYear() - c1.getYear());
        System.out.println(Arrays.toString(cars));

        System.out.println("===================================\n");

        Comparator<Car> carComparator = (c1, c2) -> {

//        int speedCompare = c2.getMaxSpeed() - c1.getMaxSpeed();
            int speedCompare = Integer.compare(c2.getMaxSpeed(), c1.getMaxSpeed());
            if (speedCompare == 0) {
                return Integer.compare(c1.getYear(), c2.getYear());
            }
            return speedCompare;
        };

        Arrays.sort(cars, carComparator);
        System.out.println(Arrays.toString(cars));


        System.out.println("===================================\n");

        Comparator<Car> byModel = Comparator.comparing(Car::getModel);
        Arrays.sort(cars, byModel);
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, Comparator.comparing(Car::getYear));
        System.out.println(Arrays.toString(cars));

        System.out.println("===================================\n");

        Arrays.sort(cars, Comparator.comparing(Car::getYear, Comparator.reverseOrder()));
        System.out.println(Arrays.toString(cars));

        System.out.println("===================================\n");

        Arrays.sort(cars, Comparator.comparing(Car::getYear).reversed());

        Arrays.sort(cars, Comparator.comparing(Car::getModel).thenComparing(Car::getYear));
        System.out.println(Arrays.toString(cars));
    }
}