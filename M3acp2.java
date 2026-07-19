class CashRegister {

    private double purchase;
    private double payment;
    private int itemCount;

    // Constructor
    public CashRegister() {
        purchase = 0;
        payment = 0;
        itemCount = 0;
    }

    // Records a purchase
    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++;
    }

    // Receives payment
    public void receivePayment(double amount) {
        payment += amount;
    }

    // Returns the change
    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        itemCount = 0;
        return change;
    }

    // (a) Returns the number of items purchased
    public int getItemCount() {
        return itemCount;
    }

    // (b) Returns the total items from all cash registers
    public static int countTotal(CashRegister[] registers) {

        int totalItems = 0;

        for (CashRegister register : registers) {
            totalItems += register.getItemCount();
        }

        return totalItems;
    }

    @Override
    public String toString() {
        return "Purchase = " + purchase + ", Payment = " + payment;
    }
}

public class M3acp2{

    public static void main(String[] args) {

        CashRegister register1 = new CashRegister();
        register1.recordPurchase(120.50);
        register1.recordPurchase(80.00);

        CashRegister register2 = new CashRegister();
        register2.recordPurchase(60.25);
        register2.recordPurchase(90.75);
        register2.recordPurchase(40.00);

        CashRegister register3 = new CashRegister();
        register3.recordPurchase(150.00);

        CashRegister[] registers = {register1, register2, register3};

        System.out.println("Register 1 Item Count: " + register1.getItemCount());
        System.out.println("Register 2 Item Count: " + register2.getItemCount());
        System.out.println("Register 3 Item Count: " + register3.getItemCount());

        System.out.println("Total Items Purchased: " +
                CashRegister.countTotal(registers));
    }
}
