import java.util.ArrayList;
import java.util.Scanner;

public class M4acp5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter Query Type (1 or 2): ");
        int q = sc.nextInt();

        if (q == 1) {

            System.out.print("Enter index and value: ");
            int p = sc.nextInt();
            int r = sc.nextInt();

            if (p >= 0 && p <= list.size()) {
                list.add(p, r);
            }

            System.out.println("Updated ArrayList:");
            System.out.println(list);

        } else if (q == 2) {

            System.out.print("Enter value to search: ");
            int p = sc.nextInt();

            System.out.println("Last Index: " + list.lastIndexOf(p));
        }
    }
}
