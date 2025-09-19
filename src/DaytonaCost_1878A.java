import java.util.HashSet;
import java.util.Scanner;

public class DaytonaCost_1878A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            HashSet<Integer> segment = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                segment.add(temp);
            }

            if (segment.contains(k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
