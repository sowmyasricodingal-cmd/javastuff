class Student {
    private String name;

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }
}

public class l4a1 {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("Rahul Kumar");
        System.out.println("Student Name: " + s.getName());
    }
}
