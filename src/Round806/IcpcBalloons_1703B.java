package Round806;

import java.util.ArrayList;
import java.util.Scanner;

public class IcpcBalloons_1703B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        ArrayList<Character> characters = new ArrayList<>();
        int count;

        while (t-- > 0) {
            characters.clear();
            count = 0;
            int n = sc.nextInt();
            String s = sc.next();

            for (int i = 0; i < n; i++) {
                if(characters.contains(s.charAt(i))) {
                    count++;
                }
                else {
                    characters.add(s.charAt(i));
                    count += 2;
                }
            }
            System.out.println(count);
        }
    }
}
