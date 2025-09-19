import java.util.Arrays;
import java.util.Scanner;

public class KuriyamaMiraiStones_433B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long[] dp = new long[n];
        dp[0] = arr[0];
        for (int i = 1; i < n; i++) {
            dp[i] = dp[i - 1] + arr[i];
        }

        Arrays.sort(arr);

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        int m = sc.nextInt();

        while (m-- > 0) {
            int type = sc.nextInt();
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;

            if (type == 1 && l == 0) {
                System.out.println(dp[r]);
            } else if (type == 1) {
                System.out.println(dp[r] - dp[l - 1]);
            } else if (type == 2 && l == 0) {
                System.out.println(arr[r]);
            } else {
                System.out.println(arr[r] - arr[l - 1]);
            }
        }
    }
}
