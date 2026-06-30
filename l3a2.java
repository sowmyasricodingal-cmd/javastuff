class Parent {
    public void sayHello() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {

    @Override
    public void sayHello() {
        System.out.println("Hello from Child");
    }
}

class l3a2 {
    public static void main(String[] args) {

        // Child method is called (overriding happens)
        Parent p1 = new Child();
        p1.sayHello();

        // Parent method is called
        Parent p2 = new Parent();
        p2.sayHello();
    }
}
