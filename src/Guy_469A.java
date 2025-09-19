import java.util.Scanner;

public class Guy_469A {
    public static void main(String[] args) {
        int p=0,q=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = sc.nextInt();
        int[] X = new int[x];
        for(int i=0;i<x;i++)
            X[i] = sc.nextInt();

        int y = sc.nextInt();
        int[] Y = new int[y];
        for(int i=0;i<y;i++)
            Y[i] = sc.nextInt();

        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if (X[i] == Y[j]) {
                    Y[j] = 0;
                    break;
                }
            }
        }

        for(int i=1;i<=n;i++){
            for(int j=0;j<x;j++){
                if(X[j]==i)
                   p++;
            }
            for(int j=0;j<y;j++){
                if(Y[j]==i)
                    q++;
            }
        }
        if(p+q == n)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
    }
}
