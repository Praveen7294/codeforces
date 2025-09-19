import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        int n,n1,k;
        String s;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        while (k-->0) {
            s = String.valueOf(n);
            if(s.charAt(s.length()-1)=='0') {
                n1 = n/10;
            } else {
                n1 = n-1;
            }
            n = n1;
        }
        System.out.println(n);
    }
}
