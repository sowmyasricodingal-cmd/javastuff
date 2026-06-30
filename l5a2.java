abstract class ObjectShape {

    abstract void showShape();

    void info() {
        System.out.println("This is abstract class method");
    }
}

class Cone extends ObjectShape {
    void showShape() {
        System.out.println("Shape is Cone");
    }
}

class Cylinder extends ObjectShape {
    void showShape() {
        System.out.println("Shape is Cylinder");
    }
}

class Pyramid extends ObjectShape {
    void showShape() {
        System.out.println("Shape is Pyramid");
    }
}

class l5a2 {
    public static void main(String[] args) {

        ObjectShape obj;

        obj = new Cone();
        obj.info();
        obj.showShape();

        obj = new Cylinder();
        obj.info();
        obj.showShape();

        obj = new Pyramid();
        obj.info();
        obj.showShape();
    }
}
