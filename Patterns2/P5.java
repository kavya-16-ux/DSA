
import java.util.Scanner;

public class P5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int m = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
