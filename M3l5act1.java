public class M3l5act1 {

    public static void main(String[] args) {

        // Alice
        Student alice = new Student("Alice", 1234);

        Course computerScience = new Course("Computer Science", 4);
        computerScience.setGrade(3.7);

        alice.addCourse(computerScience);

        System.out.println("Alice GPA: " + alice.getGPA());

        Course math = new Course("Math", 3);
        math.setGrade(4.0);

        alice.addCourse(math);

        System.out.println("Alice Updated GPA: " + alice.getGPA());

        System.out.println("\nAlice Transcript");
        System.out.println(alice.getTranscript());

        // Bob
        Student bob = new Student("Bob", 5678);

        Course csBob = new Course("Computer Science", 4);
        csBob.setGrade(3.0);

        Course mathBob = new Course("Math", 3);
        mathBob.setGrade(3.5);

        bob.addCourse(csBob);
        bob.addCourse(mathBob);

        System.out.println("Bob GPA: " + bob.getGPA());

        System.out.println("\nBob Transcript");
        System.out.println(bob.getTranscript());
    }
}
