package Round918;

import java.util.Scanner;

public class CanISquare_1915C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long sum = 0;
            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                sum += temp;
            }

            if (isInteger(Math.sqrt(sum))) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean isInteger(double number) {
        return number == Math.floor(number) && !Double.isInfinite(number);
    }

}
