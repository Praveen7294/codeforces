import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctSplit_1791D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            HashMap<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (map.isEmpty()) {
                    map.put(c, 1);
                } else if (map.containsKey(c)) {
                    int val = map.get(c) + 1;
                    map.put(c, val);
                } else {
                    map.put(c, 1);
                }
            }

            HashSet<Character> set = new HashSet<>();
            int max = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (map.containsKey(c) && map.get(c) == 1) {
                    set.add(c);
                    map.remove(c);
                } else if (map.containsKey(c) && map.get(c) > 1) {
                    set.add(c);
                    int val = map.get(c) - 1;
                    map.put(c, val);
                }
                max = Math.max(max, (set.size() + map.size()));
            }
            System.out.println(max);
        }
    }
}
