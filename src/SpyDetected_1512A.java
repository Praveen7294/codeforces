import java.util.Scanner;

public class SpyDetected_1512A {
    public static void main(String[] args) {
        int t,n,res=0;

        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();

        while (t-->0){
            n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();

            for(int i=0;i<n-1;i++){
                if(arr[0]!=arr[1] && arr[1]==arr[2]){
                    res = 1;
                    break;
                }
                else if(arr[i]!=arr[i+1]){
                    res = i+2;
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
