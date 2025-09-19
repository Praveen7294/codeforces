import java.util.Scanner;

public class Pangram_520A {
    public static void main(String[] args) {
        int count=0;

        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String s = sc.next();
        s = s.toLowerCase();

        for(char i='a';i<='z';i++){
            if(s.contains(String.valueOf(i)))
                count++;
        }

        if(count == 26)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
