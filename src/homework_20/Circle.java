package homework_20;

/*
Класс Circle (Круг)

• Создайте класс Circle, который наследуется от Shape.
• Добавьте поле radius типа double, которое хранит радиус круга.
• Создайте метод setRadius(double radius), который устанавливает значение поля radius.
• Создайте метод calculateArea(), который вычисляет и выводит площадь круга.
 */
public class Circle extends Shape {
    private double radius;
    public static final double PI = 3.141519;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }
    public double setRadius(double radius){
        this.radius = radius;
        return radius;
    }
    public double calculateArea(double r){
        return PI * Math.pow(r,2);
    }
}
