
class P03 {

    public static void main(String[] args) {
        int n = 5;
        int x;
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                x = j;
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
