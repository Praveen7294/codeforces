import java.util.Scanner;

public class MishkaAndGame_703A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int mishka=0,chris=0;

        while (t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(a>b) mishka++;
            else if(a<b) chris++;
        }
        if(mishka>chris) System.out.println("Mishka");
        else if(mishka<chris) System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
}
