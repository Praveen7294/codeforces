package Round849;

import java.util.Scanner;

public class PrependAndAppend_1791C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean flag = false;
            for (int i = 0; i <= ((n / 2) + 1) && i <= (n - 1 - i); i++) {
                if (s.charAt(i) == s.charAt(n - 1 - i)) {
                    System.out.println(n - (2 * i));
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.println(0);
            }
        }
    }
}
