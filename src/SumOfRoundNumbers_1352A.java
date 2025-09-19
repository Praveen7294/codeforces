import java.util.HashSet;
import java.util.Scanner;

public class SumOfRoundNumbers_1352A {
    public static void main(String[] args) {
        int t,round;

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();


        for(int i=0;i<t;i++) {
            round = sc.nextInt();
            int dRound = round;
            int len = Integer.toString(round).length();
            HashSet<Integer> set = new HashSet<>();
            for (int j = 1; j <= len; j++) {
                int rem = dRound % 10;
                dRound /= 10;
                if (rem != 0) {
                    set.add(rem*((int)Math.pow(10,j-1)));
                }
            }
            System.out.println(set.toArray().length);
            System.out.println(set.toString().replace("[","")
                    .replace(","," ").replace("]",""));
        }
    }
}
