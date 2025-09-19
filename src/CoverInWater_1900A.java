import java.util.Scanner;

public class CoverInWater_1900A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            char[] c = sc.next().toCharArray();

            int longEmptyCell = 0;
            int action1 = 0;
            for (int i = 0; i < n; i++) {
                if (c[i] == '.') {
                    longEmptyCell++;
                } else {
                    action1 += longEmptyCell;
                    longEmptyCell = 0;
                }
                if (longEmptyCell > 2) {
                    action1 = 2;
                    break;
                } else if (i == n - 1) {
                    action1 += longEmptyCell;
                }
            }
            System.out.println(action1);
        }
    }
}
