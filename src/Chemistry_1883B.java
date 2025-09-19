import java.util.HashMap;
import java.util.Scanner;

public class Chemistry_1883B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            if (n - k == 1) {
                System.out.println("YES");
            } else {
                HashMap<Character, Integer> map = convertIntoMap(s, n);

                for (Character c : map.keySet()) {
                    int val = map.get(c);
                    if ((val % 2) !=  0 && k > 0) {
                        int value = val - 1;
                        map.put(c, value);
                        k--;
                    }
                }

                int oddTimes = 0;
                for (Character c : map.keySet()) {
                    int val = map.get(c);
                    if (val % 2 != 0) {
                        oddTimes++;
                    }
                }

                if (oddTimes < 2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    static HashMap<Character, Integer> convertIntoMap(String s, int n) {
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
        return map;
    }
}
