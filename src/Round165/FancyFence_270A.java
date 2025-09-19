package Round165;

import java.util.Scanner;

public class FancyFence_270A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a= sc.nextInt();

            double n = (double) 360 / (180 - a);
            if(isInteger(n) && n >= 3) {
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
