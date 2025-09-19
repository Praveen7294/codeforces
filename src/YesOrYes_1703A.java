import java.util.Scanner;

public class YesOrYes_1703A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            String s = sc.next();

            s = s.toUpperCase();
            if(s.equals("YES"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
