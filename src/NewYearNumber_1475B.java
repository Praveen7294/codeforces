import java.util.Scanner;

public class NewYearNumber_1475B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n >= 2020 && isRepresent(n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static boolean isRepresent(int n) {
        for (int i = 0; i <= 500 ; i++) {
            int sum = n - (i * 2020);

            if (sum < 0) {
                break;
            }
            double j = (double) sum / 2021;

            if (j == (int) j) {
                return true;
            }
        }
        return false;
    }
}
