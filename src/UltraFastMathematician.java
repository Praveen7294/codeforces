import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        char[] ch = new char[s1.length()];

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i))
                ch[i] = '1';
            if(s1.charAt(i) == s2.charAt(i))
                ch[i] = '0';
        }
        System.out.println(ch);
    }
}
