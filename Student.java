import java.util.ArrayList;

public class Student {

    private String name;
    private int id;
    private ArrayList<Course> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void removeCourse(Course course) {
        courses.remove(course);
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public double getGPA() {

        if (courses.size() == 0)
            return 0;

        double total = 0;

        for (Course course : courses) {
            total += course.getGrade();
        }

        return total / courses.size();
    }

    public String getTranscript() {

        String transcript = "";

        transcript += "Name: " + name + "\n";
        transcript += "ID: " + id + "\n\n";

        for (Course course : courses) {

            transcript += "Course: " + course.getName() + " (" +
                    course.getCredits() + " credits)\n";

            transcript += "Grade: " + course.getGrade() +
                    " (" + course.getLetterGrade() + ")\n\n";
        }

        return transcript;
    }
}
