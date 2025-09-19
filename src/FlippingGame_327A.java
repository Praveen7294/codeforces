import java.util.Scanner;

public class FlippingGame_327A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a;
        int count1 = 0, extra0 = 0, extra0max = -1;

        while (n-- > 0) {
            a = sc.nextInt();
            if (a == 1) {
                count1 += 1;
                if (extra0 > 0) {
                    extra0 -= 1;
                }
            } else {
                extra0 += 1;
                if (extra0 > extra0max) {
                    extra0max = extra0;
                }
            }
        }

        System.out.println(count1 + extra0max);
    }
}
