package homework_23;

public class Triangle extends Shape{
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        if (!isValidSides()){

            System.out.println("Invalid sides");
            this.a = 3;
            this.b = 4;
            this.c = 5;
        }
    }

    private boolean isValidSides(){
        return a < b + c && b < a + c && c < a + b;
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
