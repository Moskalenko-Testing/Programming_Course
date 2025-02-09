package homework_36.additionCar;

import lesson_36.Car;

import java.util.Arrays;
import java.util.Comparator;

public class CarAdditionApp {
    public static void main(String[] args) {
        CarAddition[] carAdditions = new CarAddition[7];
        carAdditions[0] = new CarAddition("Audi", 2023, 300);
        carAdditions[1] = new CarAddition("BMW", 2020, 250);
        carAdditions[2] = new CarAddition("Mercedes", 2021, 270);
        carAdditions[3] = new CarAddition("Audi", 2020, 300);
        carAdditions[4] = new CarAddition("VW", 2024, 250);
        carAdditions[5] = new CarAddition("BMW", 2020, 280);
        carAdditions[6] = new CarAddition("Ferrari", 2020, 500);

        Arrays.sort(carAdditions, Comparator.comparing(CarAddition::getYear).thenComparing(CarAddition::getModel, Comparator.reverseOrder()));
        System.out.println(Arrays.toString(carAdditions));

        System.out.println("==================================\n");

        Arrays.sort(carAdditions, Comparator.comparing(CarAddition::getYear).thenComparing(CarAddition::getMaxSpeed));
        System.out.println(Arrays.toString(carAdditions));


    }
}
