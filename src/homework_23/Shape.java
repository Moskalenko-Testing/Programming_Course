package homework_23;

/*
Создайте абстрактный класс Shape с абстрактными методами для вычисления площади и периметра.
Реализуйте классы-наследники Circle, Rectangle, и Triangle.
Убедитесь, что все классы правильно вычисляют площадь и периметр.
Создайте массив объектов Shape и вычислите общую площадь и периметр всех фигур в массиве.
 */

public abstract class Shape {

    public static final double PI = 3.14159;

    public abstract double area();

    public abstract double perimeter();
}





















