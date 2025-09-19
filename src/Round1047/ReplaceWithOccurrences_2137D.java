package Round1047;

import java.util.HashMap;

public class ReplaceWithOccurrences_2137D {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int temp = fs.nextInt();
                arr[i] = temp;
                if (map.isEmpty()) {
                    map.put(temp, 1);
                } else if (map.containsKey(temp)) {
                    int val = map.get(temp) + 1;
                    map.put(temp, val);
                } else {
                    map.put(temp, 1);
                }
            }

            boolean flag = true;
            for (int i : map.keySet()) {
                if (i != map.get(i)) {
                    System.out.println(-1);
                    flag = false;
                    break;
                }
            }

            if (flag) {
                for (int i = 0; i < n - 1; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println(arr[n - 1]);
            }
        }
    }
}
