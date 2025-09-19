package Round729;

import java.util.Scanner;

public class OddSet_1542A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] array = new int[2 * n];

            int odd = 0;
            int even = 0;
            for (int i = 0; i < (2 * n); i++) {
                array[i] = sc.nextInt();

                if (array[i] % 2 == 0) {
                    ++even;
                } else {
                    ++odd;
                }
            }

            if (even == odd) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
