import java.util.Scanner;

public class Division_1669A {
    public static String division(int x){
        if( 1900 <= x)
            return "Division 1";
        else if(x >= 1600)
            return "Division 2";
        else if(x >= 1400)
            return "Division 3";
        else return "Division 4";
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n-->0){
            int x = sc.nextInt();
            System.out.println(division(x));
        }
    }
}
