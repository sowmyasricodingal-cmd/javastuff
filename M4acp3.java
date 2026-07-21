import java.util.Scanner;

public class M4acp3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rows of Matrix 1: ");
        int r1 = sc.nextInt();

        System.out.print("Columns of Matrix 1: ");
        int c1 = sc.nextInt();

        int[][] a = new int[r1][c1];

        System.out.println("Enter Matrix 1:");

        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                a[i][j] = sc.nextInt();

        System.out.print("Rows of Matrix 2: ");
        int r2 = sc.nextInt();

        System.out.print("Columns of Matrix 2: ");
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];

        System.out.println("Enter Matrix 2:");

        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                b[i][j] = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Invalid input");
            return;
        }

        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Product Matrix:");

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
