import java.util.Scanner;

public class NearlyLuckyNumber1 {
    public static void main(String[] args) {
        String s;
        int count=0;
        Scanner sc = new Scanner(System.in);
        s = sc.next();

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='7' || s.charAt(i)=='4'){
                count++;
            }
        }
        if(count==7 || count==4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
