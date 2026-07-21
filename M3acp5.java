// SingleTable class (given in FRQ - included here for testing)
class SingleTable {
    private int numSeats;
    private int height;
    private double viewQuality;

    public SingleTable(int seats, int height, double viewQuality) {
        this.numSeats = seats;
        this.height = height;
        this.viewQuality = viewQuality;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public int getHeight() {
        return height;
    }

    public double getViewQuality() {
        return viewQuality;
    }

    public void setViewQuality(double value) {
        viewQuality = value;
    }
}

// CombinedTable class
class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable t1, SingleTable t2) {
        table1 = t1;
        table2 = t2;
    }

    public boolean canSeat(int number) {
        return number <= (table1.getNumSeats() + table2.getNumSeats() - 2);
    }

    public double getDesirability() {
        double average =
                (table1.getViewQuality() + table2.getViewQuality()) / 2.0;

        if (table1.getHeight() == table2.getHeight()) {
            return average;
        } else {
            return average - 10.0;
        }
    }
}

// Main class
public class M3acp5 {
    public static void main(String[] args) {

        SingleTable t1 = new SingleTable(4, 74, 60.0);
        SingleTable t2 = new SingleTable(8, 74, 70.0);
        SingleTable t3 = new SingleTable(12, 76, 75.0);

        CombinedTable c1 = new CombinedTable(t1, t2);

        System.out.println(c1.canSeat(9));      // true
        System.out.println(c1.canSeat(11));     // false
        System.out.println(c1.getDesirability()); // 65.0

        CombinedTable c2 = new CombinedTable(t2, t3);

        System.out.println(c2.canSeat(18));       // true
        System.out.println(c2.getDesirability()); // 62.5

        t2.setViewQuality(80.0);

        System.out.println(c2.getDesirability()); // 67.5
    }
}
