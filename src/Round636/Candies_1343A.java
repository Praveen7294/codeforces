package Round636;

import java.util.Scanner;

public class Candies_1343A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int k = 2;
            int s = 3;
            while (s <= n) {
                if (n % s == 0) {
                    System.out.println(n / s);
                    break;
                }
                k++;
                s = (int) (Math.pow(2 , k) - 1);
            }
        }
    }
}
