import java.util.Scanner;

public class VasilijeInCacak_1878C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long x = sc.nextLong();

            long sumOfN = ((long) (n + 1) * n) / 2;
            long sumOfFirstK = ((long) (k + 1) * k) / 2;
            int r = n - k;
            long sumOfFirstR = ((long) (r + 1) * r) / 2;
            if ((n == k) && sumOfN == x) {
                System.out.println("YES");
            } else if (sumOfN < x) {
                System.out.println("NO");
            } else if (sumOfFirstK > x) {
                System.out.println("NO");
            } else if ((sumOfN - sumOfFirstR) < x) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
