import java.util.Scanner;

public class FairDivision_1472B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] freq = new int[3];

            for (int i = 0; i < n ; i++) {
                int temp = sc.nextInt();
                freq[temp]++;
            }

            if (((freq[1] != 0 && freq[2] == 0) && freq[1] % 2 == 0) ||
                    ((freq[1] == 0 && freq[2] != 0) && freq[2] % 2 == 0) ||
                    ((freq[1] != 0) && freq[1] % 2 == 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
