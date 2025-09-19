import java.util.Scanner;

public class Buttons_1858A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int lastTurn;
            if (c % 2 == 0) {
                lastTurn = 0;
            } else {
                lastTurn = 1;
            }

            if ((lastTurn == 1 && a >= b) || (lastTurn == 0 && a > b)) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
}
