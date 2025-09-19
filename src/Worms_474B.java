import java.util.Scanner;

public class Worms_474B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] orderedWorms = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                orderedWorms[i] = sc.nextInt();
            } else {
                int temp = sc.nextInt();
                orderedWorms[i] = orderedWorms[i - 1] + temp;
            }
        }

        int m = sc.nextInt();
        while (m-- > 0) {
            int juicyWorm = sc.nextInt();
            System.out.println(search(orderedWorms, n, juicyWorm));
        }
    }

    static int search(int[] arr, int n, int k) {
        int start = 0,end = n - 1;
        int mid;
        while (start != end) {
            mid = (start + end) / 2;
            if ((mid == 0 && k <= arr[mid]) || (mid > 0 && (k > arr[mid - 1] && k <= arr[mid]))) {
                return mid + 1;
            } else if (k < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start + 1;
    }
}
