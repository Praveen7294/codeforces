package Round1045;

import java.util.Scanner;

public class PaintingWithTwoColors_2134A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if ((n - a) % 2 == 0 && (n - b) % 2 == 0) {
                System.out.println("YES");
            } else if (((n - a) % 2 != 0 && (n - b) % 2 == 0) && b > a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
