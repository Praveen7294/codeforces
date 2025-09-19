import java.util.Scanner;

public class XAxis_1986A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int x3 = sc.nextInt();

            int d1 = Math.abs(x2 - x1) + Math.abs(x3 - x1);
            int d2 = Math.abs(x1 - x2) + Math.abs(x3 - x2);
            int d3 = Math.abs(x1 - x3) + Math.abs(x2 - x3);

            System.out.println(Math.min(d1, Math.min(d2, d3)));
        }
    }
}
