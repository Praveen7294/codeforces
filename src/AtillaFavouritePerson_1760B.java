import java.util.Scanner;

public class AtillaFavouritePerson_1760B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String s = "abcdefghijklmnopqrstuvwxyz";

        while (t-- > 0) {
            int n = sc.nextInt();
            String letter = sc.next();

            char max = 'a';

            for (int i = 0; i < n; i++) {
                if (max < letter.charAt(i)) {
                    max = letter.charAt(i);
                }
            }

            System.out.println((s.indexOf(max)) + 1);
        }
    }
}
