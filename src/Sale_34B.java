import java.util.Arrays;
import java.util.Scanner;

public class Sale_34B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] tvSets = new int[n];
        for (int i = 0; i < n; i++) {
            tvSets[i] = sc.nextInt();
        }

        Arrays.sort(tvSets);

        int i = 0;
        int maxMoney = 0;
        while (m-- > 0 && i < n) {
            if (tvSets[i] < 0) {
                maxMoney += tvSets[i];
            }
            i++;
        }

        System.out.println(Math.abs(maxMoney));
    }
}
