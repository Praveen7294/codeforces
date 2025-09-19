import java.util.Scanner;

public class PanoramixPrediction_80A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean flag = false;
        for(int i = n+1; i<m;i++){
            if(isPrime(i)) {
                flag = true;
                break;
            }
        }

        if((!flag) && isPrime(m)) System.out.println("YES");
        else System.out.println("NO");
    }

    static boolean isPrime(int n){
        boolean flag = true;
        for(int i=2;i<n;i++){
            if( n % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
