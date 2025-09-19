import java.util.Scanner;

public class CreatingWords_1985A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            String a = sc.next();
            String b = sc.next();

            char[] arrayA = a.toCharArray();
            char[] arrayB = b.toCharArray();

            char temp = arrayA[0];
            arrayA[0] = arrayB[0];
            arrayB[0] = temp;

            System.out.println(new String(arrayA) + " " + new String(arrayB));
        }
    }
}
