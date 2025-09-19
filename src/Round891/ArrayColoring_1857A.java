package Round891;

import java.util.Scanner;

public class ArrayColoring_1857A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            if (n % 2 == 0 && countNumberOfOdd(array, n) % 2 == 0) {
                System.out.println("YES");
            }
            else if (countNumberOfOdd(array, n) % 2 != 0) {
                 System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }

    public static int countNumberOfOdd(int[] array, int len) {

        int count = 0;
        for (int i = 0; i < len ; i++) {
            if( array[i] % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
