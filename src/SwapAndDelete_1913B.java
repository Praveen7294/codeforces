import java.util.Scanner;

public class SwapAndDelete_1913B {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int n = s.length();

            if (n == 1) {
                System.out.println(1);
                continue;
            }

            int ones = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    ones++;
                }
            }

            int zeros = n - ones;

            if (ones == zeros) {
                System.out.println(0);
                continue;
            }

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1' && zeros > 0) {
                    zeros--;
                } else if (s.charAt(i) == '0' && ones > 0) {
                    ones--;
                } else {
                    System.out.println(n - i);
                    break;
                }
            }
        }
    }
}
