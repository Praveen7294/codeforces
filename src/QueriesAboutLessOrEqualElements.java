import java.util.Arrays;
import java.util.HashMap;

public class QueriesAboutLessOrEqualElements {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int m = fs.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = fs.nextInt();
        }

        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = fs.nextInt();
        }

        Arrays.sort(a);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int index;
            if (map.isEmpty()) {
                index = binarySearch(a, n, b[i]);
                map.put(b[i], index);
            } else if (map.containsKey(b[i])) {
                index = map.get(b[i]);
            } else {
                index = binarySearch(a, n, b[i]);
                map.put(b[i], index);
            }

            System.out.print((index + 1) + " ");
        }
    }

    static int binarySearch(int[] arr, int n, int target) {
        int s = 0, e = n - 1;

        while (s < e) {
            int mid = (s + e) / 2;
            if (target == arr[mid]) {
                while (mid < n - 1 && arr[mid + 1] == target) {
                    mid++;
                }
                return mid;
            } else if (target < arr[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        if ((s < n && s == e) && arr[s] < target) {
            return s;
        } else if (s == e && arr[s] > target) {
            return s - 1;
        } else {
            return e;
        }
    }
}
