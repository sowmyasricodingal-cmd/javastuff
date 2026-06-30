import java.util.Scanner;

// Custom Exception
class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

class Bank {

    private int balance = 5000;

    void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(int amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than 0");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) throws InvalidAmountException {
        if (amount > balance) {
            throw new InvalidAmountException("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }
}

public class l6acp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();

        while (true) {

            System.out.println("\n--- BANK MENU ---");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            try {
                switch (choice) {

                    case 1:
                        b.showBalance();
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        int d = sc.nextInt();
                        b.deposit(d);
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        int w = sc.nextInt();
                        b.withdraw(w);
                        break;

                    case 4:
                        System.out.println("Thank you for using Banking System!");
                        return;

                    default:
                        throw new InvalidAmountException("Invalid menu option selected");
                }

            } catch (InvalidAmountException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}
