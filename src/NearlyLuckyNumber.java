import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        long n;
        int count=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();

        while (n!=0){
            if(n%10==7 || n%10==4){
                count++;
            }
            n=n/10;
        }
        if(count==7 || count==4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
