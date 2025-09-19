import java.util.Scanner;

public class ArrayWithOddSum_1296A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int countOdd = 0;
            int countEven = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();

                sum += temp;
                if (temp % 2 != 0) {
                    countOdd++;
                } else {
                    countEven++;
                }
            }

            if (sum % 2 != 0) {
                System.out.println("YES");
            } else if (countOdd > 0 && countEven > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
