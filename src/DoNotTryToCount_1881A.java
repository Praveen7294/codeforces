import java.util.Scanner;

public class DoNotTryToCount_1881A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            int maxLoop = 6;

            boolean flag = false;
            int count = 0;
            while (maxLoop-- > 0) {
                if (x.contains(s)) {
                    flag = true;
                    break;
                }
                count++;
                x += x;
            }

            if (flag) {
                System.out.println(count);
            } else {
                System.out.println(-1);
            }

        }
    }
}
