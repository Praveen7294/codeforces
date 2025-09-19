import java.util.Scanner;

public class PerfectPermutation_233A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 != 0) {
            System.out.println(-1);
        } else {
            for (int i = 1; i < n; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + 1 + " ");
                } else {
                    System.out.print(i - 1 + " ");
                }
            }
            System.out.println(n - 1);
        }
    }
}
