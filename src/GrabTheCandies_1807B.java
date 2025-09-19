import java.util.Scanner;

public class GrabTheCandies_1807B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int mihai = 0;
            int bianca = 0;

            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int temp = sc.nextInt();

                if (temp % 2 == 0) {
                    mihai += temp;
                } else {
                    bianca += temp;
                }
            }

            if (mihai > bianca) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
