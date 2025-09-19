import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        String s,s1,s2;

        Scanner sc = new Scanner(System.in);
        s = sc.next();

        s1 = s.substring(0,1);
        s1 = s1.toUpperCase();
        s2 = s.substring(1);
        System.out.println(s1+s2);
    }
}
