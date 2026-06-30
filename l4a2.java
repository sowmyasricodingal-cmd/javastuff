class Shape {
    public double getArea() {
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class l4a2 {
    public static void main(String[] args) {

        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(5, 4);

        System.out.println("Circle Area: " + s1.getArea());
        System.out.println("Rectangle Area: " + s2.getArea());
    }
}
