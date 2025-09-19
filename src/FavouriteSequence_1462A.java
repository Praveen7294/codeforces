import java.util.Scanner;

public class FavouriteSequence_1462A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] board = new int[n];
            for (int i = 0; i < n; i++) {
                board[i] = sc.nextInt();
            }

            int start = 0;
            int end = n - 1;
            int k = 0;

            int[] originalSequence = new int[n];
            while (start < end) {
                originalSequence[k] = board[start];
                originalSequence[k + 1] = board[end];
                k += 2;
                start++;
                end--;
            }
            if (start == end) {
                originalSequence[k] = board[start];
            }

            for (int i = 0; i < n; i++) {
                System.out.print(originalSequence[i] + " ");
            }
            System.out.println();
        }
    }
}
