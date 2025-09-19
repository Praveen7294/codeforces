import java.util.Scanner;

public class BlackSquare_431A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] strips = new int[4];
        int cal = 0;

        for(int i=0;i<4;i++)
            strips[i] = sc.nextInt();

        String s = sc.next();

        for(int i=0;i<s.length();i++){
            cal += strips[s.charAt(i) - '0'-1];
        }
        System.out.println(cal);
    }
}
