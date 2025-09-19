import java.util.Scanner;

public class IqTest_25A {
    public static void main(String[] args) {
        int counte=0,counto=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];

        for(int i=1;i<=n;i++)
            a[i] = sc.nextInt();

        for(int i=1;i<=n;i++)
            if(a[i]%2==0)
                counte++;
            else
                counto++;

       if(counte>counto){
           for(int i=1;i<=n;i++){
               if(a[i]%2!=0)
                   System.out.println(i);
           }
       } else if(counto>counte){
           for(int i=1;i<=n;i++){
               if(a[i]%2==0)
                   System.out.println(i);
           }
       }
    }
}
