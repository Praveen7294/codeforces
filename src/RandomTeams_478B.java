import java.util.Scanner;

public class RandomTeams_478B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int r = n - m + 1;
        long max = ((long) r * (r - 1)) / 2;

        int q = n / m;
        int re = n % m;
        long min = ((long) q * (q - 1) / 2);
        if (re > 0) {
            ++q;
            long min1 = ((long) q * (q - 1) / 2);
            min = ((m - re) * min) + (re * min1);
        } else {
            min = m * min;
        }

        System.out.println(min + " " + max);
    }
}
