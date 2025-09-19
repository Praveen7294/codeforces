import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        String s1,s2;

        Scanner sc = new Scanner(System.in);
        s1=sc.next();
        s2=sc.next();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        if(s1.compareTo(s2) == 0) {
            System.out.println(0);
        } else if(s1.compareTo(s2) > 0) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
