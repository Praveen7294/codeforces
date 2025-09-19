import java.util.Scanner;

public class LineTrip_1901A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n + 2];
            arr[0] = 0;
            for (int i = 1; i < n + 1; i++) {
                arr[i] = sc.nextInt();
            }

            arr[n + 1] = arr[n] + (2 * (x - arr[n]));

            int max = 0;
            for (int i = 0; i < n + 1; i++) {
                max = Math.max(max, (arr[i + 1] - arr[i]));
            }

            System.out.println(max);
        }
    }
}
