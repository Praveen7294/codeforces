import java.util.Scanner;

public class MaximumIncrease_702A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxLength = 1;
        int count = 1;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            } else {
                count = 1;
            }
            maxLength = Math.max(count, maxLength);
        }
        System.out.println(maxLength);
    }
}
