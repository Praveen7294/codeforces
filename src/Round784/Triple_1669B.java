package Round784;

import java.util.HashMap;
import java.util.Scanner;

public class Triple_1669B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int input = sc.nextInt();
                if (map.isEmpty()) {
                    map.put(input, 1);
                }
                else if (map.containsKey(input)) {
                    int value = map.get(input) + 1;
                    map.put(input, value);
                } else {
                    map.put(input, 1);
                }
            }

            boolean flag = false;
            for (int key : map.keySet()) {
                if (map.get(key) >= 3) {
                    System.out.println(key);
                    flag = true;
                    break;
                }
            }

            if(!flag) {
                System.out.println(-1);
            }
        }
    }
}
