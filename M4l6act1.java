import java.util.ArrayList;
import java.util.Scanner;

public class M4l6act1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lists: ");
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int size = sc.nextInt();
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = 0; j < size; j++) {
                temp.add(sc.nextInt());
            }

            lists.add(temp);
        }

        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();

        while (q-- > 0) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x <= lists.size() && y <= lists.get(x - 1).size()) {
                System.out.println(lists.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
