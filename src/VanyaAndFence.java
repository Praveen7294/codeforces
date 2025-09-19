import java.util.Scanner;

public class VanyaAndFence {
    public static void main(String[] args) {
        int n,h,w=0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        h = sc.nextInt();

        int[] f = new int[n];
        for (int i=0;i<n;i++) {
            f[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++) {
            if(f[i]<=h) {
                w = w + 1;
            } else if(f[i]>h){
                w = w + 2;
            }
        }
        System.out.println(w);
    }
}
