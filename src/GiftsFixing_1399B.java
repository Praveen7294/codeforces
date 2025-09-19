import java.util.Scanner;

public class GiftsFixing_1399B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] candies = new int[n];
            for (int i = 0; i < n; i++) {
                candies[i] = sc.nextInt();
            }

            int[] oranges = new int[n];
            for (int i = 0; i < n; i++) {
                oranges[i] = sc.nextInt();
            }

            int minCandies = min(candies, n);
            int minOranges = min(oranges, n);

            long count = 0;
            for (int i = 0; i < n; i++) {
                if (candies[i] > minCandies && oranges[i] > minOranges) {
                    int min = Math.min(minCandies, minOranges);
                    int minVal = Math.min(candies[i], oranges[i]);
                    min = minVal - min;
                    candies[i] -= min;
                    oranges[i] -= min;
                    count += min;
                }
                if (candies[i] > minCandies) {
                    int temp = candies[i] - minCandies;
                    candies[i] -= temp;
                    count += temp;
                }
                if (oranges[i] > minOranges) {
                    int temp = oranges[i] - minOranges;
                    oranges[i] -= temp;
                    count += temp;
                }
            }
            System.out.println(count);
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
