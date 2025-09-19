import java.util.Scanner;

public class Hulk {
    public static void main(String[] args) {
        int i=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s1 = "I hate that ";
        String s2 = "I hate it";
        String s3 = "I love that ";
        String s4 = "I love it";

        while (i++<=n){
            if(i == n && n%2 != 0){
                System.out.print(s2);
            }
            if(i == n && n%2 == 0){
                System.out.print(s4);
            }
            if(i < n && i%2 != 0){
                System.out.print(s1);
            }
            if(i < n && i%2 == 0)
                System.out.print(s3);
        }
    }
}
