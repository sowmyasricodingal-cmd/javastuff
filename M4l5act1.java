import java.util.ArrayList;
import java.util.Scanner;

public class M4l5act1 {

    public static boolean isPrime(int num) {

        if (num < 2)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void removePrimes(ArrayList<Integer> list) {

        for (int i = list.size() - 1; i >= 0; i--) {
            if (isPrime(list.get(i))) {
                list.remove(i);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        removePrimes(numbers);

        System.out.println("Updated List: " + numbers);
    }
}
