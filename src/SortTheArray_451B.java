import java.util.Scanner;

public class SortTheArray_451B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        int i = 0, l = 0;
        boolean flag = true;
        while (i < n - 1) {
            if (array[i] < array[i + 1]) {
                i++;
            } else {
                l = i;
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("yes");
            System.out.println(1 + " " + 1);
        } else {
            int j = n - 1, r = 0;
            boolean flag1 = true;
            while (j > 0) {
                if (array[j] > array[j - 1]) {
                    j--;
                } else {
                    r = j;
                    flag1 = false;
                    break;
                }
            }
            if (!isSorted(array, l, r)) {
                System.out.println("no");
                return;
            }
            if (flag1 || (l == 0 && r == n - 1)) {
                System.out.println("yes");
                System.out.println(1 + " " + n);
            } else if (((l > 0 && r == n - 1) && array[l - 1] < array[r])
                    || ((l > 0 && r < n - 1) && (array[l] < array[r + 1] && array[l - 1] < array[r]))
                    || ((l == 0 && r < n - 1) && array[l] < array[r + 1])) {
                System.out.println("yes");
                System.out.println((l + 1) + " " + (r + 1));
            } else {
                System.out.println("no");
            }
        }
    }

    static boolean isSorted(int[] arr, int l, int r) {
        for (int i = l; i < r - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
