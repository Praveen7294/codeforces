import java.util.Scanner;

public class EqualCandies_1676B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] candies = new int[n];
            for (int i = 0; i < n; i++) {
                candies[i] = sc.nextInt();
            }

            int minCandies = min(candies, n);

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += (candies[i] - minCandies);
            }

            System.out.println(sum);
        }
    }

    static int min(int[] arr, int n) {
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
