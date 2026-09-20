
import java.util.Scanner;

public class P7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i) + (n - i + 1); j++) {
                System.out.print("*");
            }
            System.out.println(); // moves to next line
        }
        sc.close();
    }
}
