import java.util.Scanner;

public class WayTooLongWord {
    public static void main(String[] args) {
        String word;


        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        while (x-->0) {
            word = sc.next();
            int value = word.length();

            if (value > 10) {
                System.out.println(word.charAt(0) + "" + (value - 2) + "" + word.charAt(value - 1));
            } else {
                System.out.println(word);
            }
        }
    }
}
