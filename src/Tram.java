import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        int n,capacity=0,max;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] a= new int[n];
        int[] b= new int[n];
        int[] c= new int[n];

        for (int i=0;i<n;i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            capacity = capacity - a[i];
            capacity = capacity + b[i];
            c[i] = capacity;
        }

        max=c[0];
        for(int i=1;i<n;i++) {
            if(max<c[i]){
                max=c[i];
            }
        }
        System.out.println(max);
    }
}
