import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class InterestingDrink_706B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] pDrinkPerShop = new int[n];
        for (int i = 0; i < n; i++) {
            pDrinkPerShop[i] = sc.nextInt();
        }

        Arrays.sort(pDrinkPerShop);

        int q = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        while (q-- > 0) {
            int m = sc.nextInt();

            if (!map.isEmpty() && map.containsKey(m)) {
                System.out.println(map.get(m));
            } else {
                int res = upperBound(pDrinkPerShop, n, m);
                map.put(m, res);
                System.out.println(res);
            }
        }
    }

    static int upperBound(int[] arr, int n, int m) {
        int s = 0, e = n;
        while (s < e) {
            int mid = (s + e) >>> 1;
            if (arr[mid] <= m) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return s;
    }
}
