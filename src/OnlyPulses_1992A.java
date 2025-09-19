import java.util.Scanner;

public class OnlyPulses_1992A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int five = 5;

            int max = 0;
            for (int i = 0; i <= five; i++) {
                for (int j = 0; j <= five - i; j++) {
                    for (int k = 0; k <= five - j - i; k++) {
                        max = Math.max(((a + i) * (b + j) * (c + k)), max);
                    }
                }
            }
            System.out.println(max);
        }
    }
}
