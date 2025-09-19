package Round971;

import java.util.Scanner;

public class TheLegendOfFreyaTheFrog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int k = sc.nextInt();

            int ans;
            ans = 2 * Math.max( (x+k-1)/k , (y+k-1)/k );
            if( (x+k-1)/k > (y+k-1)/k) --ans;

            System.out.println(ans);
        }
    }
}
