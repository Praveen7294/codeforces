import java.util.Scanner;

public class FoxAndSnake_510A {
    public static void main(String[] args) {
        int n,m,r=1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for(int i=1;i<=n;i++){
           if(i%2!=0){
               for(int j=1;j<=m;j++)
                   System.out.print("#");
               System.out.println();
           }
           else {
               if(r%2==0)
                   System.out.print("#");
               for(int j=1;j<=m-1;j++)
                   System.out.print(".");
               if(r%2!=0)
                   System.out.print("#");
               r++;
               System.out.println();
           }
        }
    }
}
