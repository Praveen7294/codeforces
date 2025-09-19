import java.util.Scanner;

public class SreejaAndDima_381A {
    public static void main(String[] args) {
        int sreeja=0,dima=0,i,j;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for(int k=0;k<n;k++)
            a[k] = sc.nextInt();

        if(n==1)
            sreeja += a[0];

        i=0;
        j=n-1;
        while (j>=i && n!=1){
            sreeja += Math.max(a[i],a[j]);
            if(a[i]>=a[j]) {
                a[i]=0;
                i++;
            }
            else {
                a[j]=0;
                j--;
            }
            dima += Math.max(a[i],a[j]);
            if(a[i]>=a[j]) {
                a[i]=0;
                i++;
            }
            else {
                a[j]=0;
                j--;
            }
        }
        System.out.println(sreeja+" "+dima);
    }
}
