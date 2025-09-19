import java.util.Scanner;

public class YetAnotherTwoIntegersProblem_1409A {
    public static void main(String[] args) {
        int a,b;

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            a = sc.nextInt();
            b = sc.nextInt();

            int req,res,rem;

            if(a!=b) {
                req = b > a ? b - a : a - b;
                rem = req%10;
                res = req/10;
                if(rem==0)
                    System.out.println(res);
                else
                    System.out.println(res+1);
            }
            else
                System.out.println(0);
        }
    }
}
