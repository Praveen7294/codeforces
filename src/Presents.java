import java.util.Scanner;

public class Presents {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] res = new int[n+1];

        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==arr[j]){
                    res[i]=j;
                    break;
                }
            }
        }
        for(int i=1;i<=n;i++){
            System.out.print(res[i] + " ");
        }
    }
}
