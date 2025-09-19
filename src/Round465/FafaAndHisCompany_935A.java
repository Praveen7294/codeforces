package Round465;

import java.util.Scanner;

public class FafaAndHisCompany_935A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= n / 2; i++) {
            int remainingEmployees = n - i;
            if (remainingEmployees % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
