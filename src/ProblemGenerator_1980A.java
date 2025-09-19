import java.util.HashMap;
import java.util.Scanner;

public class ProblemGenerator_1980A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        char[] difficulty = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String s = sc.next();

            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (map.isEmpty()) {
                    map.put(c, 1);
                } else if (map.containsKey(c)) {
                    int value = map.get(c) + 1;
                    map.put(c, value);
                } else {
                    map.put(c, 1);
                }
            }

            int count = 0;
            for (char c : difficulty) {
                if (map.containsKey(c) && map.get(c) < m) {
                    count += (m - map.get(c));
                } else if (!map.containsKey(c)){
                    count += m;
                }
            }
            System.out.println(count);
        }
    }
}
