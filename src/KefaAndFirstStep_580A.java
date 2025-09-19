import java.util.Scanner;

public class KefaAndFirstStep_580A {
    public static void main(String[] args) {
        int count=1,max=1;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();

        for(int i=0;i<n-1;i++){
            if(a[i]<=a[i+1]){
                count++;
                if(count>max)
                    max = count;
            } else
                count = 1;
        }
        System.out.println(max);
    }
}
