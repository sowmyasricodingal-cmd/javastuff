import java.util.Scanner;

public class M4l3act2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows: ");
        int rows = sc.nextInt();

        System.out.print("Columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        System.out.println("Spiral Order:");

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                System.out.print(arr[top][i] + " ");
            top++;

            for (int i = top; i <= bottom; i++)
                System.out.print(arr[i][right] + " ");
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
            }
        }
    }
}
