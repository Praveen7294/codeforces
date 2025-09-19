import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        String s;
        int i,j,l;
        char temp;

        Scanner sc = new Scanner(System.in);
        s = sc.next();
        l = s.length();

        char[] ch = new char[l];
        for(i=0;i<l;i++) {
            ch[i] = s.charAt(i);
        }

        for(i=l;i>0;i-=2){
            for(j=0; j<l-1;j+=2) {
                if (ch[j] > ch[j+2]) {
                    temp = ch[j];
                    ch[j] = ch[j+2];
                    ch[j+2] = temp;
                }
            }
        }
        String s1 = new String(ch);
        System.out.println(s1);
    }
}
