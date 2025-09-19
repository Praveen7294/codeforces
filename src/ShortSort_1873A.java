import java.util.Scanner;

public class ShortSort_1873A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            String s = sc.next();

            if(s.charAt(0) == 'a') System.out.println("YES");
            else if(s.charAt(1) == 'b') System.out.println("YES");
            else if(s.charAt(2) == 'c') System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
