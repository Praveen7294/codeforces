import java.util.Scanner;

public class NewYearCandles_379A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int hours = a;
        int remCandles = 0;
        while (a >= b) {
            remCandles += a % b;
            a /= b;
            hours += a;
            a += remCandles;
            remCandles = 0;
        }

        System.out.println(hours);
    }
}
