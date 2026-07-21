import java.util.ArrayList;

public class Patron {

    private String name;
    private int id;
    private ArrayList<Item> checkedOutItems;

    public Patron(String name, int id) {

        this.name = name;
        this.id = id;
        checkedOutItems = new ArrayList<>();
    }

    public void checkOutItem(Item item) {

        if (checkedOutItems.size() < 10) {
            checkedOutItems.add(item);
        } else {
            System.out.println("Cannot check out more than 10 items.");
        }
    }

    public void returnItem(Item item) {
        checkedOutItems.remove(item);
    }

    public int getNumItemsCheckedOut() {
        return checkedOutItems.size();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
