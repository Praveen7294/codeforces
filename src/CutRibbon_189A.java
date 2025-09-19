import java.util.Scanner;

public class CutRibbon_189A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans = 0;
        for (int i = 0; i <= 4000; i++) {
            for (int j = 0; j <= 4000; j++) {
                int zc = n - ((i * a) + (j * b));
                if (zc < 0) {
                    break;
                }
                double z = (zc / (double)c);
                if (z == (int)z) {
                    ans = Math.max(ans,  (i + j + (int)z));
                }
            }
        }
        System.out.println(ans);
    }
}
