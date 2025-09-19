import java.util.Scanner;

public class LuckyDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag=0;
        int[] ar= {4,7,44,47,74,77,444,447,474,477,744,747,774,777};

        for (int i : ar) {
            if (n % i == 0) {
                System.out.println("YES");
                flag = 1;
                break;
            }
        }
        if(flag==0){
            System.out.println("NO");
        }
    }
}
