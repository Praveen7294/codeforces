import java.util.Arrays;
import java.util.Scanner;

public class LessOrEqual_977C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        if ((k == 0 && arr[0] == 1)
                || (k < n && k > 0) && arr[k] == arr[k - 1]) {
            System.out.println(-1);
        } else if (n == k) {
            System.out.println(arr[n - 1]);
        } else if (k == 0) {
            System.out.println(arr[0] - 1);
        } else {
            System.out.println(arr[k - 1]);
        }
    }
}
