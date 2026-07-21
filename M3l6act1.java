import java.time.LocalDate;

public class M3l6act1 {

    public static void main(String[] args) {

        Book book = new Book(
                "B101",
                "Harry Potter",
                LocalDate.of(1997, 6, 26),
                "J. K. Rowling",
                350);

        DVD dvd = new DVD(
                "D201",
                "Avatar",
                LocalDate.of(2009, 12, 18),
                "James Cameron",
                162);

        CD cd = new CD(
                "C301",
                "Thriller",
                LocalDate.of(1982, 11, 30),
                "Michael Jackson",
                9);

        Patron patron = new Patron("Alice", 1001);

        patron.checkOutItem(book);
        patron.checkOutItem(dvd);

        System.out.println("Items Checked Out: "
                + patron.getNumItemsCheckedOut());

        patron.returnItem(dvd);

        System.out.println("After Returning DVD: "
                + patron.getNumItemsCheckedOut());

        patron.checkOutItem(cd);

        System.out.println("After Checking Out CD: "
                + patron.getNumItemsCheckedOut());
    }
}
