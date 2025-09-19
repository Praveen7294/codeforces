package Round271;

import java.util.Scanner;

public class Keyboard_474A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String s = sc.next();

        String s1 = "qwertyuiop asdfghjkl; zxcvbnm,./";

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int currentIndex = s1.indexOf(s.charAt(i));
            if (ch == 'R') {
                output.append(s1.charAt(currentIndex - 1));
            } else {
                output.append(s1.charAt(currentIndex + 1));
            }
        }
        System.out.println(output);
    }
}
