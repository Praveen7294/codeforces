import java.util.Scanner;

public class Boredom_455A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        int maxVal = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }

        int[] cnt = new int[maxVal + 1];
        for (int val : arr) {
            cnt[val]++;
        }

        long[] dp = new long[maxVal + 1];
        dp[0] = 0;
        if (maxVal >= 1) {
            dp[1] = cnt[1];
        }

        for (int i = 2; i <= maxVal; i++) {
            dp[i] = Math.max(dp[i - 1], (dp[i - 2] + (i * (long) cnt[i])));
        }

        System.out.println(dp[maxVal]);
    }
}
