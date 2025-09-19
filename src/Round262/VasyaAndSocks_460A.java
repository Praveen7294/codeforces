package Round262;

import java.util.Scanner;

public class VasyaAndSocks_460A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n < m) {
            System.out.println(n);
        } else {
            int totalDays = n;
            int remainingSocks;
            while (n >= m) {
                remainingSocks = n % m;
                n /= m;
                totalDays += n;
                n += remainingSocks;
            }
            System.out.println(totalDays);
        }
    }
}
