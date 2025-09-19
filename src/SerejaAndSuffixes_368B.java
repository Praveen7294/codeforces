import java.util.HashSet;
import java.util.Scanner;

public class SerejaAndSuffixes_368B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        int[] dp = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (set.isEmpty()) {
                set.add(arr[i]);
                dp[i] = 1;
            } else if (!set.contains(arr[i])) {
                set.add(arr[i]);
                dp[i] = dp[i + 1] + 1;
            } else {
                dp[i] = dp[i + 1];
            }
        }

        while (m-- > 0) {
            int l = sc.nextInt();

            System.out.println(dp[l - 1]);
        }
    }
}
