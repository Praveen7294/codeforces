package Round928;

import java.util.Scanner;

public class VladAndTheBestOfFive_1926A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int aCount = 0;
            int bCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == 'A') {
                    aCount++;
                }
                else {
                    bCount++;
                }
            }

            System.out.println(aCount > bCount ? 'A' : 'B');
        }
    }
}
