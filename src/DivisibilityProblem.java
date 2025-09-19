import java.util.Scanner;

public class DivisibilityProblem {
    public static void main(String[] args) {
        int i=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] op = new int[n];

        while (n-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            int res = a%b;
            if(res==0) {
                op[i] = res;
                i++;
            } else {
                op[i] = b - res;
                i++;
            }
        }

        for(int j=0;j<i;j++) {
            System.out.println(op[j]);
        }
    }
}
