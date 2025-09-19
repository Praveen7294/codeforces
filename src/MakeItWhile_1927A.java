import java.util.Scanner;

public class MakeItWhile_1927A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            if (!s.contains("B")) {
                System.out.println(0);
            } else {
                int min = Integer.MAX_VALUE;
                int max = 0;

                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == 'B') {
                        min = Math.min(min, i);
                        max = Math.max(max, i);
                    }
                }

                System.out.println(max - min + 1);
            }
        }
    }
}
