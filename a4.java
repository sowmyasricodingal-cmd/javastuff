class a4 {
    int rollNo;
    String name;
    int age;
    String course;

    // Constructor
    Student(int rollNo, String name, int age, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Course  : " + course);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        // Creating student objects
        Student s1 = new Student(101, "Arun", 20, "CSE");
        Student s2 = new Student(102, "Divya", 19, "ECE");
        Student s3 = new Student(103, "Rahul", 21, "MECH");

        // Displaying student details
        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
