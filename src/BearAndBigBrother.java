import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        int a,b,yrs=0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        while (a<=b) {
            a = 3*a;
            b = 2*b;
            yrs++;
        }
        System.out.println(yrs);
    }
}
