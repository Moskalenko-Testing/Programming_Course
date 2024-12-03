package homework_23;


public class ShapesApp {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{new Circle(2), new Rectangle(3, 4), new Triangle(5, 6, 7) };

        double totalArea = 0;
        double totalPerimeter = 0;

        for (int i = 0; i < shapes.length; i++) {
            totalArea += shapes[i].area();
            totalPerimeter += shapes[i].perimeter();
        }
        System.out.println("Общяя площадь : " + String.format("%.2f", totalArea));
        System.out.println("Общий периметр : " + String.format("%.2f", totalPerimeter));


    }
}
