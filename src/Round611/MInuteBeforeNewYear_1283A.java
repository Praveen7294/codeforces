package Round611;

import java.util.Scanner;

public class MInuteBeforeNewYear_1283A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int h = sc.nextInt();
            int m = sc.nextInt();

            if(m == 0) {
                System.out.println((24 - h) * 60);
            } else {
                System.out.println(((23 - h) * 60) + (60 - m));
            }
        }
    }
}
