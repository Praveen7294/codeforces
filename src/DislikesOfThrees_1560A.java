import java.util.Scanner;

public class DislikesOfThrees_1560A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            for(int i=1;i<=n;i++)
                if(i%3 == 0 || i%10 == 3) n++;
            System.out.println(n);
        }
    }
}
