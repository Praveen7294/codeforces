import java.util.Scanner;

public class TwoSubstring_550A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] dp = new int[s.length()];
        int n = s.length();

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'B') {
                dp[i] = 1;
            } else if (s.charAt(i) == 'B' && s.charAt(i + 1) == 'A') {
                dp[i] = 0;
            } else {
                dp[i] = -1;
            }
        }
        dp[n - 1] = -1;

        if (check(dp, n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean check(int[] arr, int n) {
        int firstZero = -1, lastZero = -1;
        int firstOne = - 1, lastOne = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                if (firstZero == -1) {
                    firstZero = i;
                }
                lastZero = i;
            } else if (arr[i] == 1) {
                if (firstOne == -1) {
                    firstOne = i;
                }
                lastOne = i;
            }
        }

        if (firstZero == -1 || firstOne == -1) {
            return false;
        }

        return Math.abs(firstOne - lastZero) > 1 || Math.abs(firstZero - lastOne) > 1;
    }
}

