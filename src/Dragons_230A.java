import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Dragons_230A {
    public static void main(String[] args) {
        int s,n;

        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        n = sc.nextInt();

        Pair[] p = new Pair[n];

        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            p[i] = new Pair(x, y);
        }

        Arrays.sort(p, Comparator.comparingInt(p2 -> p2.strength));

        boolean flag = true;

        for(int i=0;i<n;i++){
            if(s > p[i].strength) s += p[i].bonus;
            else {
                flag = false;
                break;
            }
        }

        if(flag) System.out.println("YES");
        else System.out.println("NO");
    }
}

class Pair{
    int strength;
    int bonus;

    Pair(int s, int b){
        this.strength = s;
        this.bonus = b;
    }
}