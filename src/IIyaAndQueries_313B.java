import java.util.Scanner;

public class IIyaAndQueries_313B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();

        int[] dp = new int[c.length];

        dp[0] = 0;
        for (int i = 1; i < c.length; i++) {
            if (c[i] == c[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = dp[i - 1];
            }
        }

        int t = sc.nextInt();

        while (t-- > 0) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;

            System.out.println(dp[r] - dp[l]);
        }
    }
}
