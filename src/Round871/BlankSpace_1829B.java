package Round871;

import java.util.Scanner;

public class BlankSpace_1829B {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            int max = 0, count = 0;
            for (int i = 0; i < n; i++) {
                if(array[i] != 0) {
                    max = Math.max(max, count);
                    count = 0;
                }
                else {
                    count++;
                }
            }
            max = Math.max(count, max);
            System.out.println(max);
        }
    }
}
