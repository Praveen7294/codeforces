package Round1044;

import java.util.HashMap;
import java.util.Scanner;

public class RedStone_2133A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                if (map.isEmpty()) {
                    map.put(temp, 1);
                } else if (map.containsKey(temp)) {
                    int val = map.get(temp) + 1;
                    map.put(temp, val);
                } else {
                    map.put(temp, 1);
                }
            }

            boolean flag = false;
            for (int i : map.keySet()) {
                if (map.get(i) > 1) {
                    System.out.println("YES");
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println("NO");
            }
        }
    }
}
