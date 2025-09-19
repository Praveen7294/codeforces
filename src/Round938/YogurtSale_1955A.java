package Round938;

import java.util.Scanner;

public class YogurtSale_1955A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            double pricePerYogurt = (double) b / 2;

            if (a <= pricePerYogurt) {
                System.out.println(n * a);
            } else if (n % 2 == 0) {
                 System.out.println((int) (n * pricePerYogurt));
            } else {
                System.out.println((int) (((n - 1) * pricePerYogurt) + a));
            }
        }
    }
}
