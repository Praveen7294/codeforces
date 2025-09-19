import java.util.Scanner;

public class Marathon_1692A {
    public static void main(String[] args) {
        int t,count;

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        int[] n = new int[4];

        while(t-->0){
            count=0;
            for(int i=0;i<4;i++)
                n[i] = sc.nextInt();

            for(int i=1;i<4;i++){
                if(n[0]<n[i])
                    count++;
            }
            System.out.println(count);
        }
    }
}
