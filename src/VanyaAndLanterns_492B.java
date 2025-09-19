import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns_492B {
    public static void main(String[] args) {
        int n,l;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        l = sc.nextInt();

            int[] lanterns = new int[n];

            for(int i=0;i<n;i++)
                lanterns[i] = sc.nextInt();

            if(n>1){
            Arrays.sort(lanterns);

            if(n==2 && l==2){
                double res = (lanterns[1] - lanterns[0]) / 2.0;
                System.out.println(res);
            }
            else {

                int[] d = new int[n - 1];

                for (int i = 0; i < n - 1; i++) {
                    d[i] = lanterns[i + 1] - lanterns[i];
                }

                Arrays.sort(d);

                int max = d[n - 2];

                double min_d = max / 2.0;
                int zeroth = Arrays.binarySearch(lanterns, 0);
                int last = Arrays.binarySearch(lanterns, l);

                double res1 = 0, res2 = 0;

                if (zeroth < 0) {
                    res1 = lanterns[0];
                }
                if (last < 0) {
                    res2 = l - lanterns[n - 1];
                }

                double res = Math.max(res1, res2);
                System.out.println(Math.max(res, min_d));
            }
        }
        else{
            double res1 = lanterns[0] - 0.0;
            double res2 = l - lanterns[0];
                System.out.println(Math.max(res1, res2));
        }
    }
}
