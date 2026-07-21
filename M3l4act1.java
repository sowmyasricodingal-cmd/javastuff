interface Shape {
    double getArea();
}

class Rectangle implements Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {

    public double calculateTotalArea(Shape[] shapes) {

        double total = 0;

        for (Shape shape : shapes) {
            total += shape.getArea();
        }

        return total;
    }
}

public class M3l4act1 {

    public static void main(String[] args) {

        Shape[] shapes = {
            new Rectangle(5, 6),
            new Circle(4),
            new Rectangle(3, 8)
        };

        AreaCalculator calculator = new AreaCalculator();

        double totalArea = calculator.calculateTotalArea(shapes);

        System.out.printf("Total Area of All Shapes: %.2f%n", totalArea);
    }
}
