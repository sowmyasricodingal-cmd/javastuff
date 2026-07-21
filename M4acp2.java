import java.util.Scanner;

public class M4acp2 {

    public static int kadane(int[] arr) {

        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        if (k == 1) {
            System.out.println("Maximum Sum = " + kadane(arr));
            return;
        }

        int[] temp = new int[n * 2];

        for (int i = 0; i < n * 2; i++) {
            temp[i] = arr[i % n];
        }

        int answer = kadane(temp);

        if (totalSum > 0) {
            answer += (k - 2) * totalSum;
        }

        System.out.println("Maximum Sum = " + answer);
    }
}
