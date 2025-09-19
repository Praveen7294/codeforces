package Round1044;

import java.util.Arrays;
import java.util.Scanner;

public class Villagers_2133B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] villagers = new int[n];

            for (int i = 0; i < n; i++) {
                villagers[i] = sc.nextInt();
            }

            Arrays.sort(villagers);

            long sum = 0;
            int i = 0;
            int maxAll = Integer.MIN_VALUE;
            while (i < n - 1) {
                int temp = Math.max(villagers[i], villagers[i + 1]);
                sum += temp;
                int min = Math.min(villagers[i], villagers[i + 1]);
                villagers[i] -= min;
                villagers[i + 1] = min;
                maxAll = Math.max(temp, maxAll);
                i += 2;
            }

            if (i == n - 1) {
                sum += villagers[n - 1];
            }

            System.out.println(sum);
        }
    }
}
