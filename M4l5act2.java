import java.util.ArrayList;
import java.util.Scanner;

public class M4l5act2 {

    public static ArrayList<Integer> reverseList(ArrayList<Integer> list) {

        ArrayList<Integer> reversed = new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }

        return reversed;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        System.out.println("Reversed List: " + reverseList(list));
    }
}
