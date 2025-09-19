package Round1003;

import java.util.Scanner;

public class SkibidusAndAmongu_2065A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int n = s.length();
            s = s.substring(0, n - 2);

            s = s.concat("i");
            System.out.println(s);
        }
    }
}
