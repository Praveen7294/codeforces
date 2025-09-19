import java.util.Scanner;

public class SameParitySummand_1352B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (k > n || (k % 2 == 0 && n % 2 != 0)) {
                System.out.println("NO");
            } else if (n % k == 0) {
                System.out.println("YES");
                for (int i = 1; i < k; i++) {
                    System.out.print(n / k + " ");
                }
                System.out.println(n / k);
            } else {
                int quo = n / k;
                int rem = n % k;

                if (((quo + rem) % 2 == 0 && quo % 2 == 0)
                        || (quo + rem) % 2 != 0 && quo % 2 != 0) {
                    System.out.println("YES");
                    for (int i = 1; i < k; i++) {
                        System.out.print(quo + " ");
                    }
                    System.out.println(quo + rem);
                } else if ((k - 1) % 2 != 0) {
                    System.out.println("NO");
                } else if (quo == 1) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                    for (int i = 1; i <= k / 2; i++) {
                        System.out.print((quo - 1) + " " + (quo + 1) + " ");
                    }
                    System.out.println(quo + rem);
                }
            }
        }
    }
}
