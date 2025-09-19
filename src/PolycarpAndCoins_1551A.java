import java.util.Scanner;

public class PolycarpAndCoins_1551A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();

            int min = Integer.MAX_VALUE,c1=0,c2=0,i=0;
            for(int j=0;j<n/2;j++){
                i = n - 2*j;

                if (min > Math.abs(i - j)) {
                    min = Math.abs(i-j);
                    c1 = i;
                    c2 = j;
                }
            }
            System.out.println(c1+" "+c2);
        }
    }
}
