import java.util.Scanner;

public class CandiesAndTwoSisters_1335A {
    public static void main(String[] args) {
        int res;

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();

            if(n%2==0){
                res = n/2-1;
                System.out.println(res);
            } else {
                res = n / 2;
                System.out.println(res);
            }
        }
    }
}
