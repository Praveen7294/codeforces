import java.util.Scanner;

public class PolycarpAndCoins {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int quo = n / 3;
            int rem = n % 3;

            if (rem == 1) {
                System.out.println((quo + 1) + " " + quo);
            } else if (rem == 2) {
                System.out.println(quo + " " + (quo + 1));
            } else {
                System.out.println(quo + " " + quo);
            }
        }
    }
}
