import java.util.Scanner;

public class SumOfOddIntegers_1327A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            long square = (long) k * k;

            if (n >= square && (k & 1) == (n & 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
