package homework_36.additionCar;
/*
Отсортировать машины по году выпуска, если год равен - отсортировать по модели в обратном порядке
Отсортировать машины по году выпуска, если год равен - отсортировать по максимальной скорости в порядке возрастания
 */

public class CarAddition {
    private String model;
    private int year;
    private int maxSpeed;

    public CarAddition(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
