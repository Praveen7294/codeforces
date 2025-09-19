package Round719;

import java.util.Scanner;

public class OrdinaryNumbers_1520B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int numberOfDigit = countDigit(n);

            long numberOfOrdinaryNumbers = 0;
            for (int i = 1; i <= numberOfDigit; i++) {
                long r = (long) Math.pow(10, i);
                long k = (r - 1) / 9;
                if (k > n) continue;
                numberOfOrdinaryNumbers += (r <= n) ? ((r - 1) / k) : (n / k);
            }
            System.out.println(numberOfOrdinaryNumbers);
        }
    }

    static int countDigit(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}
