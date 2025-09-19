import java.util.Scanner;

public class ArrivalOfTheGeneral_144A {
    public static void main(String[] args) {
        int max,min;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] soldr = new int[n];
        int maxidx=0,minidx=n-1;

        for(int i=0;i<n;i++)
            soldr[i] = sc.nextInt();

        max = soldr[0];
        min = soldr[n-1];

        for(int i=0;i<n;i++){
            if(max<soldr[i]) {
                max = soldr[i];
                maxidx = i;
            }
            if(min>=soldr[i]) {
                min = soldr[i];
                minidx = i;
            }
        }
        if(minidx<maxidx)
            System.out.println((maxidx+(n-1-minidx))-1);
        else
            System.out.println(maxidx+(n-1-minidx));
    }
}
