package homework_22.vehicle;
/*
Дочерние классы Car, Bicycle и Motorcycle должны переопределить
метод startEngine() для запуска соответствующего типа двигателя (если есть).

Создайте массив транспортных средств разных типов. Используйте полиморфизм для
вызова метода startEngine() для каждого транспортного средства.
 */
public class Car extends Vehicle{

    @Override
    public void startEngine() {
        System.out.println("Автомобиль: Завожу двигатель прямого згорания");
    }
}