import java.util.Scanner;

public class M4acp4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            int minCol = 0;

            for (int j = 1; j < n; j++) {
                if (arr[i][j] < arr[i][minCol]) {
                    minCol = j;
                }
            }

            boolean isSaddle = true;

            for (int k = 0; k < n; k++) {
                if (arr[k][minCol] > arr[i][minCol]) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println(arr[i][minCol]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Invalid input");
        }
    }
}
