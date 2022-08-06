public class DemoString8 {
    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {
            if (n==1) {
                System.out.print(n+" ");
                continue;
            }
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    System.out.print(n+" ");
                    break;
                }
            }
        }
    }
}
