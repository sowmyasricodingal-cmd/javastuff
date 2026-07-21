import java.util.ArrayList;
import java.util.Scanner;

public class M4acp6 {

    public static void swapFirstLast(ArrayList<String> list) {

        if (list.size() < 2) {
            return;
        }

        String temp = list.get(0);
        list.set(0, list.get(list.size() - 1));
        list.set(list.size() - 1, temp);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Enter strings:");

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        swapFirstLast(list);

        System.out.println("Updated List:");
        System.out.println(list);
    }
}
