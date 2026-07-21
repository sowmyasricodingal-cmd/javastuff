import java.util.Scanner;

public class M4l4act1 {

    static void rotateRing(int[][] mat, int s, int r) {

        int minRow = s - 1;
        int minCol = s - 1;
        int maxRow = mat.length - s;
        int maxCol = mat[0].length - s;

        int size = 2 * (maxRow - minRow + maxCol - minCol);
        int[] ring = new int[size];
        int idx = 0;

        for (int i = minRow; i <= maxRow; i++) ring[idx++] = mat[i][minCol];
        for (int j = minCol + 1; j <= maxCol; j++) ring[idx++] = mat[maxRow][j];
        for (int i = maxRow - 1; i >= minRow; i--) ring[idx++] = mat[i][maxCol];
        for (int j = maxCol - 1; j > minCol; j--) ring[idx++] = mat[minRow][j];

        r = r % size;
        if (r < 0) r += size;

        reverse(ring, 0, size - 1);
        reverse(ring, 0, r - 1);
        reverse(ring, r, size - 1);

        idx = 0;

        for (int i = minRow; i <= maxRow; i++) mat[i][minCol] = ring[idx++];
        for (int j = minCol + 1; j <= maxCol; j++) mat[maxRow][j] = ring[idx++];
        for (int i = maxRow - 1; i >= minRow; i--) mat[i][maxCol] = ring[idx++];
        for (int j = maxCol - 1; j > minCol; j--) mat[minRow][j] = ring[idx++];
    }

    static void reverse(int[] arr, int l, int h) {
        while (l < h) {
            int t = arr[l];
            arr[l] = arr[h];
            arr[h] = t;
            l++;
            h--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = sc.nextInt();

        int ring = sc.nextInt();
        int rotation = sc.nextInt();

        rotateRing(arr, ring, rotation);

        for (int[] row : arr) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
