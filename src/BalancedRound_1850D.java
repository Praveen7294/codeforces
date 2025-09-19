import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound_1850D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] quesDLevel = new int[n];
            for (int i = 0; i < n; i++) {
                quesDLevel[i] = sc.nextInt();
            }

            if (n == 1) {
                System.out.println(0);
                continue;
            }

            Arrays.sort(quesDLevel);

            int max = 0;
            int count = 1;
            for (int i = 0; i < n -1; i++) {
                if (Math.abs(quesDLevel[i] - quesDLevel[i + 1]) <= k) {
                    count++;
                } else {
                    count = 1;
                }
                max = Math.max(max, count);
            }
            System.out.println(n - max);
        }
    }
}
