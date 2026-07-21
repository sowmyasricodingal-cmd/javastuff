import java.time.LocalDate;

public class Book extends Item {

    private String author;
    private int pages;

    public Book(String id, String title, LocalDate date,
                String author, int pages) {

        super(id, title, date, 21);

        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
}
