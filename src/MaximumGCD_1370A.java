import java.util.Scanner;

public class MaximumGCD_1370A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // brute force
//        while (t-->0){
//            int n = sc.nextInt();
//
//            int maxGcd = 0;
//            for(int i=2;i<n;i++)
//                for(int j=i+1;j<=n;j++) maxGcd = Math.max(maxGcd, gcd(i,j));
//            System.out.println(maxGcd);
//        }

        // optimize solution
        while (t-->0){
            int n = sc.nextInt();

            if( n % 2 == 0) System.out.println( n/2 );
            else System.out.println( (n-1)/2 );
        }

    }

//    static int gcd(int a, int b){
//
//        int maxDivisor = 0;
//        for(int i=1;i<=a;i++){
//            if( a % i == 0 && b % i == 0) maxDivisor = Math.max(maxDivisor,i);
//        }
//        return maxDivisor;
//    }
}
