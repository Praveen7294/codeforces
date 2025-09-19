package Round383;

import java.util.Scanner;

public class ArpaHardExam_742A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int reducedN = n % 4;

        if (reducedN == 0 && n != 0) {
            System.out.println(6);
            return;
        }

        int lastDigit = (int) Math.pow(8, reducedN) % 10;
        System.out.println(lastDigit);
    }
}
