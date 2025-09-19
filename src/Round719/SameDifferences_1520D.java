package Round719;

import java.util.HashMap;
import java.util.Scanner;

public class SameDifferences_1520D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                temp -= i;

                if (map.isEmpty()) {
                    map.put(temp, 1);
                } else if (map.containsKey(temp)) {
                    int val = map.get(temp) + 1;
                    map.put(temp, val);
                } else {
                    map.put(temp, 1);
                }
            }

            long sum = 0;
            for (int key : map.keySet()) {
                if (map.get(key) >= 2) {
                    int r = map.get(key);
                    sum += ((long) (r - 1) * r) / 2;
                }
            }
            System.out.println(sum);
        }
    }
}
