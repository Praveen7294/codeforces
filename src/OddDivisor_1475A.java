import java.util.Scanner;

public class OddDivisor_1475A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            long n = sc.nextLong();

            if(n != 1 && n % 2 != 0) System.out.println("YES");
            else {
                while ( n % 2 == 0){
                    n /= 2;
                }
                if( n != 1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
