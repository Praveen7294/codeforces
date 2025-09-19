import java.util.Scanner;

public class KthNotDivisibleByN_1352C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (k < n) {
                System.out.println(k);
                continue;
            }

            int reqK = k + (k / (n-1));
            reqK = (reqK % n == 0) ? reqK -1 : reqK;
            System.out.println(reqK);
        }
    }
}
