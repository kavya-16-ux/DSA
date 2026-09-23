
class P02 {

    public static void main(String[] args) {
        int n = 5;
        int x;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                x = j;
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
