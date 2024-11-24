package homework_20;

/*
 В методе main создайте объекты классов Rectangle и Circle.
• Установите значения для их полей с помощью соответствующих методов.
• Установите имя фигуры, используя поле name, унаследованное от класса Shape.
• Вызовите метод displayInfo() и методы вычисления площади для каждого объекта,
чтобы вывести информацию о фигуре и её площади.
 */
public class ShapesApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle-1",15,17);
        Circle circle = new Circle("Circle-1A",7.8);

        System.out.println(rectangle.displayInfo());
        System.out.println(circle.displayInfo());

        System.out.println("rectangle.calculateArea() : " + rectangle.calculateArea());
        System.out.println("circle.calculateArea : " + circle.calculateArea(13.4));


    }
}
