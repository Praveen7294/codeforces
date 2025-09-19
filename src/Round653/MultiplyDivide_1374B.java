package Round653;

import java.util.Scanner;

public class MultiplyDivide_1374B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int moves = 0;
            while (n % 3 == 0) {
                if (n % 3 == 0 && n % 6 != 0) {
                    n *= 2;
                    moves++;
                } else if (n % 6 == 0) {
                    n /= 6;
                    moves++;
                }
                if (n == 1) {
                    break;
                }
            }
            if(n == 1) {
                System.out.println(moves);
            } else {
                System.out.println(-1);
            }
        }
    }
}
