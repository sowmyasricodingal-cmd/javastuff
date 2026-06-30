import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private double salary;
    private double netSalary;

    // setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getNetSalary() {
        return netSalary;
    }

    public void calculateNetSalary(int pf) {
        double pfAmount = (salary * pf) / 100;
        this.netSalary = salary - pfAmount;
    }
}

public class Main {

    public static Employee inputDetails() {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Enter Employee ID: ");
        emp.setId(sc.nextInt());

        System.out.print("Enter Employee Name: ");
        emp.setName(sc.next());

        System.out.print("Enter Salary: ");
        emp.setSalary(sc.nextDouble());

        return emp;
    }

    public static void l4a3(String[] args) {

        Employee emp = inputDetails();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter PF %: ");
        int pf = sc.nextInt();

        emp.calculateNetSalary(pf);

        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Net Salary: " + emp.getNetSalary());
    }
}
