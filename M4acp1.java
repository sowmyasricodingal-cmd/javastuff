import java.util.Scanner;

public class M4acp1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] inverse = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            inverse[arr[i]] = i;
        }

        System.out.println("Inverse Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(inverse[i] + " ");
        }
    }
}
