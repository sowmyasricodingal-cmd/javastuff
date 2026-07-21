import java.time.LocalDate;

public abstract class Item {

    private String id;
    private String title;
    private LocalDate publicationDate;
    private int maxCheckoutDays;

    public Item(String id, String title, LocalDate publicationDate, int days) {
        this.id = id;
        this.title = title;
        this.publicationDate = publicationDate;
        this.maxCheckoutDays = days;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public int getMaxCheckoutDays() {
        return maxCheckoutDays;
    }
}
