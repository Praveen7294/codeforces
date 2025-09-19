import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        String s;
        int i,j=0;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        s = s.toLowerCase();

        for (i = 0; i < (s.length()); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'y') {
                s = s.replace("a","");
                s = s.replace("e","");
                s = s.replace("i","");
                s = s.replace("o","");
                s = s.replace("u","");
                s = s.replace("y","");
            }
        }

        char[] ch = new char[2*(s.length())];
        for(i=0;i<2*(s.length());i+=2) {
            ch[i] = '.';
            ch[i+1] = s.charAt(j);
            j++;
        }
        System.out.println(ch);
    }
}
