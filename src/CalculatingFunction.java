// In this solution time limit exceed

import java.util.Scanner;

public class CalculatingFunction {
    public static void main(String[] args) {
        long sume=0,sumo=0,res;

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        for(long i=1;i<=n;i+=2){
            sumo += i;
        }
        for(long i=2;i<=n;i+=2){
            sume += i;
        }
        res = sume - sumo;
        System.out.println(res);
    }
}
