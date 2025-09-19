import java.util.Arrays;
import java.util.Scanner;

public class RemoveSmallest_1399A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0){
            int n = sc.nextInt();
            int[] array = new int[n];
            for(int i=0;i<n;i++){
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            int count=0;
            for(int i=0;i<n-1;i++){
                if((array[i+1] - array[i])<=1){
                    count++;
                }
            }
            if(count==n-1 || n==1){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
