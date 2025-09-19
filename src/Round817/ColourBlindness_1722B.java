package Round817;

import java.util.Scanner;

public class ColourBlindness_1722B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            String[] grid = new String[2];
            grid[0] = sc.next();
            grid[1] = sc.next();

            boolean flag = true;
            for (int i = 0; i < n; i++) {
                if ((grid[0].charAt(i) == 'R' && grid[1].charAt(i) == 'G')
                        || (grid[0].charAt(i) == 'G' && grid[1].charAt(i) == 'R')
                        || (grid[0].charAt(i) == 'R' && grid[1].charAt(i) == 'B')
                        || (grid[0].charAt(i) == 'B' && grid[1].charAt(i) == 'R')) {
                    flag = false;
                    System.out.println("NO");
                    break;
                }
            }

            if(flag) {
                System.out.println("YES");
            }
        }
    }
}
