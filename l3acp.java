class Calculator {

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Method Overriding example
class AdvancedCalculator extends Calculator {

    @Override
    int add(int a, int b) {
        System.out.println("Overridden method in AdvancedCalculator");
        return a + b + 10; // extra bonus logic
    }
}

class l3acp {
    public static void main(String[] args) {

        AdvancedCalculator obj = new AdvancedCalculator();

        // Overridden method
        System.out.println("Result: " + obj.add(10, 20));

        // Overloaded method (from parent class)
        System.out.println("Result: " + obj.add(10, 20, 30));
    }
}
