import java.util.Scanner;

public class VasyaAndHipster_581A {
    public static void main(String[] args) {
        int r,b;
        int dColor=0,sColor=0;

        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
        b = sc.nextInt();

        if(r<b){
            dColor += r;
            b -= r;
            sColor += b/2;
            System.out.println(dColor+" "+sColor);
        }
        else if(b<r){
            dColor += b;
            r -= b;
            sColor += r/2;
            System.out.println(dColor+" "+sColor);
        }
        else {
            dColor = r;
            System.out.println(dColor+" "+sColor);
        }
    }
}
