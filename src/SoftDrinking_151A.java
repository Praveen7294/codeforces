import java.util.Scanner;

public class SoftDrinking_151A {
    public static void main(String[] args) {
        int n,k,l,c,d,p,nl,np;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        l = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        p = sc.nextInt();
        nl = sc.nextInt();
        np = sc.nextInt();

        int totalDrink = k*l;
        int totalLimesSlices = c*d;

        int eachFriendDrink = totalDrink/nl;
        int eachFriendSalt = p/np;

        int min = Math.min(eachFriendDrink,eachFriendSalt);
        System.out.println((Math.min(min,totalLimesSlices))/n);
    }
}
