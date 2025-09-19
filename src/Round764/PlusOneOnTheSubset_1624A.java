package Round764;

import java.util.Scanner;

public class PlusOneOnTheSubset_1624A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            int max = maxElementInArray(array, n);
            int min = minElementInArray(array, n);

            System.out.println(max - min);
        }
    }

    static int maxElementInArray(int[] array, int n) {
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if(array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int minElementInArray(int[] array, int n) {
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if(array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
