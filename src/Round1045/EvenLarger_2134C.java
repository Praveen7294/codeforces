package Round1045;

import java.util.Scanner;

public class EvenLarger_2134C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0 ) {
            int n = sc.nextInt();

            int[] arr = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                arr[i] = sc.nextInt();
            }

            long count = 0;
            for (int i = 2; i <= n; i += 2) {
                int i1 = arr[i - 1] - arr[i];
                if (i != n) {
                    if (arr[i] < arr[i - 1]) {
                        count += i1;
                        arr[i - 1] -= i1;
                    }
                    if (arr[i] < arr[i + 1]) {
                        int temp = (arr[i + 1] - arr[i]);
                        count += temp;
                        arr[i + 1] -= temp;
                    }
                    int r = (arr[i - 1] + arr[i + 1]);
                    if (r > arr[i]) {
                        int temp = (r - arr[i]);
                        count += temp;
                        arr[i + 1] -= temp;
                    }
                } else if (arr[i - 1] > arr[i]){
                    count += i1;
                }
            }

            System.out.println(count);
        }
    }
}
