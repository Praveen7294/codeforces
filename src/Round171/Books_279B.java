package Round171;

import java.util.Scanner;

public class Books_279B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        int[] books = new int[n];

        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }

        int start = 0, end = 0, sum = 0;
        int count = 0;
        while (end < n) {
            sum += books[end];
            if (sum > t) {
                while (sum > t) {
                    sum -= books[start];
                    start++;
                }
            }
            count = Math.max(count , (end - start + 1));
            end++;
        }
        System.out.println(count);
    }
}
