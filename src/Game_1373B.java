import java.util.Scanner;

public class Game_1373B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int chance = 0;
            while (s.length() > 2 && !isAllElementsEqual(s)) {
                int currPosition = 0;
                while (currPosition < s.length() - 1
                        && s.charAt(currPosition) == s.charAt(currPosition + 1)) {
                    currPosition++;
                }
                if (currPosition < s.length() - 1
                        && s.charAt(currPosition) != s.charAt(currPosition + 1)) {
                    if (currPosition == 0) {
                        s = s.substring(2);
                    } else if (currPosition + 2 < s.length()) {
                        s = s.substring(0, currPosition) + s.substring(currPosition + 2);
                    } else {
                        s = s.substring(0, currPosition);
                    }
                    chance++;
                }
            }

            if (s.length() == 2 && s.charAt(0) != s.charAt(1)) {
                chance++;
            }

            if (chance % 2 != 0) {
                System.out.println("DA");
            } else {
                System.out.println("NET");
            }
        }
    }

    static boolean isAllElementsEqual (String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}
