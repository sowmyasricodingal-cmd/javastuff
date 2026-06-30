class Shape {
    public double getVolume() {
        return 0;
    }
}

class Cube extends Shape {
    private double side;

    Cube(double side) {
        this.side = side;
    }

    public double getVolume() {
        return side * side * side;
    }
}

class Cuboid extends Shape {
    private double length, width, height;

    Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getVolume() {
        return length * width * height;
    }
}

class Cylinder extends Shape {
    private double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getVolume() {
        return 3.14 * radius * radius * height;
    }
}

class l4acp {
    public static void main(String[] args) {

        Shape cube = new Cube(4);
        Shape cuboid = new Cuboid(3, 4, 5);
        Shape cylinder = new Cylinder(2, 7);

        System.out.println("Cube Volume: " + cube.getVolume());
        System.out.println("Cuboid Volume: " + cuboid.getVolume());
        System.out.println("Cylinder Volume: " + cylinder.getVolume());
    }
}
