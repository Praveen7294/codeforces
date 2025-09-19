import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        long n,m,a,len,bre;

        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        a=sc.nextInt();

        len=n/a;
        if(n%a != 0) {
            len++;
        }
        bre=m/a;
        if(m%a != 0) {
            bre++;
        }
        System.out.println(len*bre);
    }
}
