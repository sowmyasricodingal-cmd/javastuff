import java.util.Scanner;

public class M4l1act2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int index = -1;

        for (int i = 0; i < n; i++) {

            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        System.out.println("Index: " + index);
    }
}
