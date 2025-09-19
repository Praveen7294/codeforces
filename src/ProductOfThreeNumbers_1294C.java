import java.util.Scanner;

public class ProductOfThreeNumbers_1294C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            boolean flag = false;
            for (int i = 2; i <= 1000; i++) {
                double num = (double) n / i;
                if (num != Math.floor(num)) {
                    continue;
                }
                n = n / i;
                for (int j = i + 1; j <= 10000; j++) {
                    double num1 = (double) n / j;
                    if (num1 == Math.floor(num1) && num1 > j) {
                        System.out.println("YES");
                        System.out.println(i + " " + j + " " + (int) num1);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }

            if (!flag) {
                System.out.println("NO");
            }
        }
    }
}
