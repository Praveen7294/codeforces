import java.util.Scanner;

public class NastiaAndNearlyGoodNumbers_1521A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();

            if (b == 1) {
                System.out.println("NO");
                continue;
            }

            boolean flag = false;
            for (long i = a * b; i <= Math.pow(10, 18); i += (a * b)) {
                for (long j = a; j <= i; j += a) {
                    if ((i - j) % a == 0 && (i - j) % i != 0 && j != (i - j)) {
                        System.out.println("YES");
                        System.out.println(j + " " + (i - j) + " " + i);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
            if (!flag) {
                System.out.println("NO");
            }
        }
    }
}
