import java.util.Scanner;

public class BoringApartments_1433A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();

            int res = 0;
            for(int i=1;i<10;i++){
                if( (double)n/i == 1 || (double)n/i == 11 || (double)n/i == 111 || (double)n/i == 1111){
                    res += (i-1) * 10;
                    n /= i;
                    if( n == 1 ) res += 1;
                    else if( n == 11) res += 3;
                    else if( n == 111) res += 6;
                    else res += 10;
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
