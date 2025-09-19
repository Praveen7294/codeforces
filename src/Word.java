import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        String s,s1;
        int count=0;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        s1 = s.toUpperCase();

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == s1.charAt(i)) {
                count++;
            }
        }
        if(count>(s.length()/2)){
            System.out.println(s.toUpperCase());
        } else if(count<(s.length()/2)) {
            System.out.println(s.toLowerCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}
