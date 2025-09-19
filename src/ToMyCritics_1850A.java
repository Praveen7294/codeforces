import java.util.Scanner;

public class ToMyCritics_1850A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int res1 = a+b;
            int res2 = b+c;
            int res3 = c+a;

            if(res1 >= 10 || res2 >= 10 || res3 >= 10)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
