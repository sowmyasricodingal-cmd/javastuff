import java.util.Arrays;

class DataSet {

    private double[] values;
    private int count;
    private double total;

    // Constructor
    public DataSet() {
        values = new double[100];
        count = 0;
        total = 0;
    }

    // Adds a value to the dataset
    public void addValue(double value) {
        if (count >= values.length) {
            System.out.println("Cannot add more values.");
            return;
        }

        values[count] = value;
        total += value;
        count++;
    }

    // Returns the average
    public double getAverage() {
        if (count == 0) {
            return 0;
        }
        return total / count;
    }

    // Part (a): Returns the standard deviation
    public double getStandardDeviation() {

        if (count == 0) {
            return 0;
        }

        double average = getAverage();
        double squaredDifference = 0;

        for (int i = 0; i < count; i++) {
            double difference = values[i] - average;
            squaredDifference += difference * difference;
        }

        return Math.sqrt(squaredDifference / count);
    }

    // Part (b): Average of averages
    public static double calculateOverallAverage(DataSet[] list) {

        double totalAverage = 0;

        for (DataSet data : list) {
            totalAverage += data.getAverage();
        }

        return totalAverage / list.length;
    }

    // Displays the stored values
    public void displayData() {
        System.out.println("Stored Values: " +
                Arrays.toString(Arrays.copyOf(values, count)));
    }
}

public class M3l2act1 {

    public static void main(String[] args) {

        // Test Standard Deviation
        DataSet sample = new DataSet();

        sample.addValue(12.5);
        sample.addValue(8.0);
        sample.addValue(15.5);
        sample.addValue(10.0);

        sample.displayData();
        System.out.println("Average: " + sample.getAverage());
        System.out.println("Standard Deviation: " + sample.getStandardDeviation());

        System.out.println();

        // Test Average of Averages
        DataSet first = new DataSet();
        first.addValue(25);
        first.addValue(35);
        first.addValue(45);

        DataSet second = new DataSet();
        second.addValue(15);
        second.addValue(25);
        second.addValue(35);

        DataSet third = new DataSet();
        third.addValue(55);
        third.addValue(65);
        third.addValue(75);

        DataSet[] allDataSets = { first, second, third };

        System.out.println("Average of All Dataset Averages: "
                + DataSet.calculateOverallAverage(allDataSets));
    }
}
