import java.util.Scanner;

public class AlternatingSubsequence_1343C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] dp = new int[n];

            int max = Integer.MIN_VALUE;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                dp[i] = sc.nextInt();

                if (i == 0) {
                    max = dp[i];
                } else if ((dp[i] > 0 && dp[i - 1] > 0) || (dp[i] < 0 && dp[i - 1] < 0)){
                    max = Math.max(dp[i], max);
                } else {
                    sum += max;
                    max = dp[i];
                }
            }

            System.out.println(sum + max);
        }
    }
}
