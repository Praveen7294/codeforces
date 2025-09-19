import java.util.Scanner;

public class LCMProblem_1389A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long l = sc.nextInt();
            long r = sc.nextInt();

            if (l * 2 <= r) {
                System.out.println(l + " " + (l * 2));
            } else {
                System.out.println(-1 + " " + -1);
            }
        }
    }
}
