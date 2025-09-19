import java.util.Scanner;

public class OddQueries_1807D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();

            int[] pSum = new int[n];
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    pSum[i] = sc.nextInt();
                } else {
                    int a = sc.nextInt();
                    pSum[i] = a + pSum[i - 1];
                }
            }

            while (q-- > 0) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();

                int sum = (k * (r - l + 1));
                if (l > 1) {
                    sum += pSum[l - 2];
                }
                if(r < n) {
                    sum += pSum[n - 1] - pSum[r - 1];
                }


                if (sum % 2 != 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
