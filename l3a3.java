class Superclass {
    int number = 56;

    void show() {
        System.out.println("Superclass method");
    }
}

class Subclass extends Superclass {

    int number = 96;

    void show() {
        super.show(); // calling parent method
        System.out.println("Subclass number: " + number);
        System.out.println("Superclass number: " + super.number);
    }
}

class l3a3 {
    public static void main(String[] args) {

        Subclass obj = new Subclass();
        obj.show();
    }
}
