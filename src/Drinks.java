import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        float per,sum=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=n;

        while (n-->0){
            per = sc.nextInt();
            per = per/n1;
            sum += per;
        }
        System.out.println(sum);
    }
}
