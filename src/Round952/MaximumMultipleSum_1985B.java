package Round952;

import java.util.Scanner;

public class MaximumMultipleSum_1985B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int max = 0;
            int x = 0;
            for (int i = 2; i <= n; i++) {
                int k = n / i;
                int sum = ((k + 1) * k) / 2;
                if (sum >= max) {
                    max = sum;
                    x = i;
                }
            }
            System.out.println(x);
        }
    }
}
