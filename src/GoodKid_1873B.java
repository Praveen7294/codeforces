import java.util.Scanner;

public class GoodKid_1873B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int minIndex = min(arr, n);
            arr[minIndex] += 1;

            int product = 1;
            for (int i = 0; i < n; i++) {
                product *= arr[i];
            }

            System.out.println(product);
        }
    }

    static int min(int[] arr, int n) {
        int min = arr[0];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                min = arr[i];
                idx = i;
            }
        }
        return idx;
    }
}
