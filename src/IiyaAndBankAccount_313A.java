import java.util.Scanner;

public class IiyaAndBankAccount_313A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n>=10) System.out.println(n);
        else if(n<=-10){
            int first = n / 10;
            int rem = n % 10;
            int second = n / 100;
            second = second * 10 + rem;
            System.out.println(Math.max(first,second));
        }
    }
}
