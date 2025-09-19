import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        int k,n,w,res=0;

        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();
        w = sc.nextInt();

        for (int i=1;i<=w;i++){
            res += i*k;
        }
        if(res-n > 0) {
            System.out.println(res-n);
        } else {
            System.out.println("0");
        }
    }
}
