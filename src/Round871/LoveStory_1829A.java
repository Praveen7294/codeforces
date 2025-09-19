package Round871;

import java.util.Scanner;

public class LoveStory_1829A {
    public static void main(String[] args) {

        String code = "codeforces";

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int count = 0;
            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) != code.charAt(i)) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
