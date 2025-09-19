import java.util.Scanner;

public class MinimalSquare_1360A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // by using mathematics
//        while (t-->0){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//
//            if( a == b) System.out.println(4*a*a);
//            else if( a < b) {
//                a = 2*a;
//                if( a == b) System.out.println(a*b);
//                else if(a < b) System.out.println(b*b);
//                else System.out.println(a*a);
//            }
//            else {
//                b = 2*b;
//                if( a == b) System.out.println(a*b);
//                else if(a > b) System.out.println(a*a);
//                else System.out.println(b*b);
//            }
//        }

        //
        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int min = Math.min(a,b);
            int max = Math.max(a,b);
            int res = Math.max(min*2,max);
            System.out.println(res*res);
        }

    }
}
