import java.util.Scanner;

public class rot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int k = sc.nextInt();

        String str = String.valueOf(num);
        int len = str.length();

        k = k % len;

        String rotated = str.substring(len - k) + str.substring(0, len - k);

        System.out.println(rotated);

        sc.close();
    }
}
