package Round636;

import java.util.Scanner;

public class BalancedArray_1343B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();

            if ((n / 2) % 2 == 0) {
                System.out.println("YES");

                long sumOfEven  = 2 * (((long) (n + 2) * n) / 8);
                int even = 2;
                for (int i = 1; i <= n / 2; i++) {
                    System.out.print(even + " ");
                    even += 2;
                }
                int odd = 1;
                long sumOfOdd = 0;
                for (int i = 1; i <= (n / 2) - 1; i++) {
                    System.out.print(odd + " ");
                    sumOfOdd += odd;
                    odd += 2;
                }
                System.out.println(sumOfEven - sumOfOdd);
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
