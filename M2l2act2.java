class Circle {

    private double radius;

    // Constructor
    public Circle(double r) {
        radius = r;
    }

    // Returns the radius
    public double getRadius() {
        return radius;
    }

    // Calculates the area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Calculates the perimeter (circumference)
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Displays circle details
    public void displayDetails() {
        System.out.println("Radius: " + getRadius());
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculatePerimeter());
    }
}

public class M3l2act2 {

    public static void main(String[] args) {

        Circle c1 = new Circle(7.5);

        System.out.println("Circle Information");
        c1.displayDetails();
    }
}
