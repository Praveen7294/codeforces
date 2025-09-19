package Round762;

import java.util.Scanner;

public class SquareString_1619A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String str = sc.next();

            int n = str.length();
            if(n % 2 != 0) {
                System.out.println("NO");
            }
            else {
                boolean flag = false;
                for (int i = 0; i < n / 2; i++) {
                    if(str.charAt(i) != str.charAt((n / 2) + i)){
                        flag = true;
                        break;
                    }
                }
                if(flag) {
                    System.out.println("NO");
                }
                else {
                    System.out.println("YES");
                }
            }
        }
    }
}
