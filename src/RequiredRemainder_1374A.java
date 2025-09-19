import java.util.Scanner;

public class RequiredRemainder_1374A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int n = sc.nextInt();

            int ans = n - n % x + y;
            if(ans<=n) System.out.println(ans);
            else System.out.println( n - n % x - (x - y));
        }
    }
}
