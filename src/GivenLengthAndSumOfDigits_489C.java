import java.util.Scanner;

public class GivenLengthAndSumOfDigits_489C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int s = sc.nextInt();

        if ((s == 0 && m > 1) || (m == 1 && s >= 10) || (m * 9 < s)) {
            System.out.println(-1 + " " + -1);
        } else if (m == 1) {
            System.out.println(s + " " + s);
        } else {
            int[] max = new int[m];

            for (int i = 0; i < m; i++) {
                int digit = Math.min(s, 9);
                max[i] = digit;
                s -= digit;
            }

            int[] min = reverse(max, m);

            if (min[0] == 0) {
                min[0]++;
                int i = 1;
                while (i < m && min[i] == 0) {
                    i++;
                }
                min[i]--;
            }

            System.out.println(arrayToString(min, m));
            System.out.println(arrayToString(max, m));
        }
    }

    static int[] reverse(int[] arr, int n) {
        int[] revArr = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            revArr[n - i - 1] = arr[i];
        }
        return revArr;
    }

    static String arrayToString(int[] arr, int m) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < m; i++) {
            s.append(arr[i]);
        }
        return s.toString();
    }
}
