interface MyInterface {
    void method1();
    void method2();
}

class l6a1 implements MyInterface {

    public void method1() {
        System.out.println("Method 1 executed");
    }

    public void method2() {
        System.out.println("Method 2 executed");
    }

    public static void main(String[] args) {

        MyInterface obj = new Demo();
        obj.method1();
        obj.method2();
    }
}
