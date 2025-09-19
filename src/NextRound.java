import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        int n,k,i,count=0;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int[] arr= new int[n];

        if(n>=k) {
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            for (i = 0; i < n; i++) {
                if (arr[i] >= arr[k-1] && arr[i] != 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
