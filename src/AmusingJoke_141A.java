import java.util.Scanner;

public class AmusingJoke_141A {
    public static void main(String[] args) {
        int count =0;

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s = s1+s2;

        char[] ch1 = new char[s3.length()];
        for(int i=0;i<s3.length();i++)
            ch1[i] = s3.charAt(i);

        char[] ch2= new char[s.length()];
        for(int i=0;i<s.length();i++)
            ch2[i] = s.charAt(i);

        for (char c : ch2) {
            for (int j = 0; j < ch1.length; j++) {
                if (c == ch1[j]) {
                    ch1[j] = '0';
                    count++;
                    break;
                }
            }
        }
        if(count==s.length() && s3.length()==s.length())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
