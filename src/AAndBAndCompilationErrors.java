import java.util.Scanner;

public class AAndBAndCompilationErrors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        n--;

        int t = 2;
        while (t-- > 0) {
            int newSum = 0;
            for (int i = 0; i < n; i++) {
                newSum += sc.nextInt();
            }

            System.out.println(sum - newSum);
            sum = newSum;
            n--;
        }
    }
}
