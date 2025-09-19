import java.util.Scanner;

public class TwoElevators_1729A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int timeTakenByFirstElevator = a - 1;
            int timeTakenBySecondElevator = (c - 1) + Math.abs(b - c);

            if (timeTakenByFirstElevator < timeTakenBySecondElevator) {
                System.out.println(1);
            } else if (timeTakenByFirstElevator > timeTakenBySecondElevator) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }
}
