package Round1049;

public class UltimateValue_2140C {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();

            int[] arr = new int[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();
                sum += arr[i] * ((i & 1) == 0 ? 1 : - 1);
            }

            long ans = sum + ((n & 1) == 0 ? n - 2 : n - 1);

            int even_min = Integer.MAX_VALUE;
            int odd_max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if ((i & 1) == 0) {
                    ans = Math.max(ans, (sum + (i - (long) 2 * arr[i])) + odd_max);
                    even_min = Math.min(even_min, 2 * arr[i] + i);
                } else {
                    ans = Math.max(ans, (sum + (i + (long) 2 * arr[i])) - even_min);
                    odd_max = Math.max(odd_max, 2 * arr[i] - i);
                }
            }
            System.out.println(ans);
        }
    }
}
