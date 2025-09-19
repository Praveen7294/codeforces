package Round1048;

import java.util.Arrays;

public class CakeCollection_2139B {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            int m = fs.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
            }

            Arrays.sort(arr);

            int k = Math.min(n, m);
            long sum = 0;
            for (int i = 0; i < k; i++) {
                int rate = arr[n - 1 - i];
                int weight = m - i;
                sum += (long) rate * weight;
            }
            System.out.println(sum);
        }
    }
}
