package Round839;

import java.util.Scanner;

public class APlusB_1771A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int a = Integer.parseInt(String.valueOf(s.charAt(0)));
            int b = Integer.parseInt(String.valueOf(s.charAt(2)));

            System.out.println(a + b);
        }
    }
}
