import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        int n,x=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        String st;
        while(n-->0) {
            st=sc.next();
            if(st.charAt(0) == '+'|| st.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        System.out.println(x);
    }
}
