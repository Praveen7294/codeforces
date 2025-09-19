package Round898;

import fastscanner.FastScanner;

public class BuildingAnAquarium_1873E {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            int x = fs.nextInt();

            int[] arr = new int[n];
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = fs.nextInt();

                if (min > arr[i]) {
                    min = arr[i];
                }
            }

            long high = Integer.MAX_VALUE;
            long low = min;
            long ans = 1;

            while (low <= high) {
                long mid = (low + high) / 2;

                long water = 0;
                for (int i = 0; i < n; i++) {
                    if (arr[i] < mid) {
                        water += (mid - arr[i]);
                    }

                    if (water > x) {
                        break;
                    }
                }

                if (water <= x) {
                    low = mid + 1;
                    ans = mid;
                } else {
                    high = mid - 1;
                }
            }
            System.out.println(ans);

        }
    }
}
