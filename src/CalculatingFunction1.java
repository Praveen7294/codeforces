import java.util.Scanner;

public class CalculatingFunction1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(function(n));
    }
    static long function(long n) {
        if(n%2==0)
            return n/2;
        else
            return -(n+1)/2;
    }
}
