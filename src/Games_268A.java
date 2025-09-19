import java.util.Scanner;

public class Games_268A {
    public static void main(String[] args) {
        int count=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        int[] g = new int[n];

        for(int i=0;i<n;i++){
            h[i] = sc.nextInt();
            g[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(h[i]==g[j])
                    count++;
            }
        }
        System.out.println(count);
    }
}
