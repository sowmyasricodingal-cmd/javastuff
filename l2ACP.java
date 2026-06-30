import java.util.Scanner;

// Parent class
class Operation {
    void display() {
        System.out.println("Calculator Operation");
    }
}

// Addition class
class Addition extends Operation {
    int add(int a, int b) {
        return a + b;
    }
}

// Subtraction class
class Subtraction extends Addition {
    int subtract(int a, int b) {
        return a - b;
    }
}

// Multiplication class
class Multiplication extends Subtraction {
    int multiply(int a, int b) {
        return a * b;
    }
}

// Division class (lowest child class)
class Division extends Multiplication {
    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return (double) a / b;
    }
}

// Main class
public class l2ACP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating object of lowest child class
        Division obj = new Division();

        System.out.println("----- CALCULATOR -----");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + obj.add(a, b));
                break;

            case 2:
                System.out.println("Result: " + obj.subtract(a, b));
                break;

            case 3:
                System.out.println("Result: " + obj.multiply(a, b));
                break;

            case 4:
                System.out.println("Result: " + obj.divide(a, b));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
