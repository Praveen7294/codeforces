import java.util.Scanner;

public class DominoPilling {
    public static void main(String[] args) {
        int m,n,a=2,b=1,a1,a2,res;
        Scanner sc = new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();

        a1=m*n;
        a2=a*b;
        res=a1/a2;
        System.out.println(res);
    }
}
