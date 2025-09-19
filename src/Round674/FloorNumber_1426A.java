package Round674;

import java.util.Scanner;

public class FloorNumber_1426A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            if (n == 1 || n == 2) {
                System.out.println(1);
            } else if (x > n){
                System.out.println(2);
            } else {
                n = n - 2;
                if (n % x == 0){
                    System.out.println((n / x) + 1);
                } else {
                    System.out.println((n / x) + 2);
                }
            }
        }
    }
}
