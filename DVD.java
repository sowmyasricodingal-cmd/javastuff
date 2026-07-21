import java.time.LocalDate;

public class DVD extends Item {

    private String director;
    private int runningTime;

    public DVD(String id, String title, LocalDate date,
               String director, int runningTime) {

        super(id, title, date, 7);

        this.director = director;
        this.runningTime = runningTime;
    }

    public String getDirector() {
        return director;
    }

    public int getRunningTime() {
        return runningTime;
    }
}
