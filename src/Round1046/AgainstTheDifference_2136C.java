package Round1046;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AgainstTheDifference_2136C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] dp = new int[n + 1];
            dp[0] = 0;
            int[] count = new int[n + 1];
            count[0] = 0;
            HashMap<Integer, List<Integer>> pos = new HashMap<>();
            for (int i = 1; i <= n; i++) {
                int x = sc.nextInt();
                count[x]++;

                pos.putIfAbsent(x, new ArrayList<>());
                pos.get(x).add(i);

                dp[i] = dp[i - 1];

                if (count[x] % x == 0) {
                    int start_idx = pos.get(x).get(0);
                    dp[i] = Math.max(dp[i], dp[start_idx - 1] + x);
                }
            }
            System.out.println(dp[n]);
        }
    }
}

