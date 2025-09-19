package Round849;

import java.util.Scanner;

public class FollowingDirections_1791B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean flag = true;
            int x = 0, y = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'L') {
                    --x;
                } else if (s.charAt(i) == 'R') {
                    ++x;
                } else if (s.charAt(i) == 'U') {
                    ++y;
                } else {
                    --y;
                }
                if (x == 1 && y == 1) {
                    System.out.println("YES");
                    flag = false;
                    break;
                }
            }

            if(flag) {
                System.out.println("NO");
            }
        }

    }
}
