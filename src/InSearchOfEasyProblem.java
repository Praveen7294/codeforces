import java.util.Scanner;

public class InSearchOfEasyProblem {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1=n;

        while (n-->0){
            int i = sc.nextInt();

            if(i==0)
                count++;
        }
        if(count==n1)
            System.out.println("EASY");
        else
            System.out.println("HARD");
    }
}
