package homework_20;

/*
Класс Rectangle (Прямоугольник)

• Создайте класс Rectangle, который наследуется от Shape.
• Добавьте поля width и height типа double, которые хранят размеры прямоугольника.
• Создайте метод setDimensions(double width, double height), который устанавливает значения полей width и height.
• Создайте метод calculateArea(), который вычисляет и выводит площадь прямоугольника.
 */
public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    public void setDimensions(double width, double height) {
        this.height = height;
        this.width = width;
    }
    public double calculateArea(){
        return width * height;
    }
}
