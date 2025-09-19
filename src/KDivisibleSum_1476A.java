import java.util.Scanner;

public class KDivisibleSum_1476A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (n > k) {
                int q = n / k;
                int r = n % k;
                if (r > 0) {
                    k = (k * q) + k;
                } else {
                    k = (k * q);
                }
            }

            int quo = k / n;
            int rem = k % n;

            if (rem > 0) {
                rem = 1;
            }

            System.out.println(quo + rem);
        }
    }
}
