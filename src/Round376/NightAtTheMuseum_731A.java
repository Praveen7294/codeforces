package Round376;

import java.util.Scanner;

public class NightAtTheMuseum_731A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String embosser = "abcdefghijklmnopqrstuvwxyz";

        char currentPointer = 'a';
        int rotation = 0;
        for (int i = 0; i < s.length(); i++) {
            int path1;
            int path2;
            int currentPointer_index = embosser.indexOf(currentPointer);
            int currentLetter = embosser.indexOf(s.charAt(i));
            if (currentLetter <= currentPointer_index) {
                path1 = currentPointer_index - currentLetter;
                path2 = currentLetter + (26 - currentPointer_index);
            } else {
                path1 = currentLetter - currentPointer_index;
                path2 = (26 - currentLetter) + currentPointer_index;
            }
            rotation += Math.min(path1, path2);
            currentPointer = s.charAt(i);
        }
        System.out.println(rotation);
    }
}
