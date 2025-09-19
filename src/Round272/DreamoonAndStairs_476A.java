package Round272;

import java.util.Scanner;

public class DreamoonAndStairs_476A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int quo = n / 2;
        int rem = n % 2;
        if (n < m) {
            System.out.println(-1);
        } else if (rem == 0 && quo % m == 0){
            System.out.println(quo);
        } else if (rem == 0 && quo % m != 0) {
            int r = quo % m;
            System.out.println(quo + (m - r));
        } else if (rem != 0 && (quo + 1) % m == 0) {
            System.out.println(quo + 1);
        } else {
            int r = (quo + 1) % m;
            System.out.println((quo + 1) + (m - r));
        }
    }
}
