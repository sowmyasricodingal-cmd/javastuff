import java.util.Scanner;

public class rating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rating = sc.nextInt();

        switch (rating) {
            case 5:
                System.out.println("Excellent");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 3:
                System.out.println("Average");
                break;
            case 2:
                System.out.println("Poor");
                break;
            case 1:
                System.out.println("Very Poor");
                break;
            default:
                System.out.println("Invalid Rating");
        }

        sc.close();
    }
}
