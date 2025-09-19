import java.util.Scanner;

public class Fence_363B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] fences = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();

            if (i == 0) {
                fences[i] = temp;
            } else {
                fences[i] = fences[i - 1] + temp;
            }
        }

        int index = getIndex(k, n, fences);
        System.out.println(index + 1);
    }

    private static int getIndex(int k, int n, int[] fences) {
        int min = Integer.MAX_VALUE;
        int index = Integer.MAX_VALUE;
        for (int i = k - 1; i < n; i++) {
            if (i - k < 0) {
                if (min < fences[i]) {
                    continue;
                }
                min = fences[i];
                index = 0;
            } else {
                int temp = fences[i] - fences[i - k];
                if (min < temp) {
                    continue;
                }
                min = temp;
                index = i - k + 1;
            }
        }
        return index;
    }
}
