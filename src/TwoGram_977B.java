import java.util.HashMap;
import java.util.Scanner;

public class TwoGram_977B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        HashMap<String, Integer> map = new HashMap<>();
        String maxKey = "";
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            String key = String.valueOf(a) + b;
            if (map.isEmpty()) {
                map.put(key, 1);
            } else if (map.containsKey(key)) {
                int value = map.get(key) + 1;
                map.put(key, value);
            } else {
                map.put(key, 1);
            }
            if (max < map.get(key)) {
                max = map.get(key);
                maxKey = key;
            }
        }
        System.out.println(maxKey);
    }
}
