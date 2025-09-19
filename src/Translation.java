import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        String s,t,sr="";
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        t = sc.next();

        char ch;
        for(int i=s.length()-1;i>=0;i--){
            ch=s.charAt(i);
            sr += ch;
        }
        if(t.equals(sr)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
