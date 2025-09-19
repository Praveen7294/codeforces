import java.util.Arrays;
import java.util.Scanner;

public class PashmakAndFlowers_459B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] flowers = new int[n];
        for (int i = 0; i < n; i++) {
            flowers[i] = sc.nextInt();
        }

        Arrays.sort(flowers);

        int max = flowers[n - 1];
        int min = flowers[0];
        System.out.print(max - min + " ");
        if (max == min) {
            long result = ((long) n * (n - 1)) / 2;
            System.out.println(result);
            return;
        }
        int maxCount = 0;
        int minCount = 0;

        int k = n - 1;
        while (k >= 0 && flowers[k] == max) {
            maxCount++;
            k--;
        }
        int l = 0;
        while (l < n && flowers[l] == min) {
            minCount++;
            l++;
        }
        System.out.println((long) maxCount * minCount);
    }
}

