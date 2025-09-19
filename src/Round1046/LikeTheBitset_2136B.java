package Round1046;

import java.util.Scanner;

public class LikeTheBitset_2136B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            boolean flag = false;
            int count = 0;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '1') {
                    count++;
                    if (count >= k) {
                        System.out.println("NO");
                        flag = true;
                        break;
                    }
                } else {
                    count = 0;
                }
            }

            if (flag) {
                continue;
            }

            System.out.println("YES");

            int largest = n;
            int smallest = 1;
            for (int i = 0; i < n - 1; i++) {
                char c = s.charAt(i);
                if (c == '0') {
                    System.out.print(largest + " ");
                    largest--;
                } else {
                    System.out.print(smallest + " ");
                    smallest++;
                }
            }
            if (s.charAt(n - 1) == '0') {
                System.out.println(largest);
            } else {
                System.out.println(smallest);
            }
        }
    }
}
