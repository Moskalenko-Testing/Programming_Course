package lesson_36;

import java.util.Comparator;

public class CarModelCompaarator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        String model1 = car1.getModel();
        String model2 = car2.getModel();
        return  model1.compareTo(model2);
        //return car1.getModel().compareTo(car2.getModel());
    }
}
