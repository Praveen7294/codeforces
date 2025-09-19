import java.util.Scanner;

public class BachgoldProblem_749A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            int count = n / 2;
            System.out.println(count);
            for (int i = 0; i < count - 1; i++) {
                System.out.print(2 + " ");
            }
            System.out.println(2);
        } else {
            int count = n / 2;
            System.out.println(count);
            for (int i = 0; i < count - 1; i++) {
                System.out.print(2 + " ");
            }
            System.out.println(3);
        }
    }
}
