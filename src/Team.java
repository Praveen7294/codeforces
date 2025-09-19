import java.util.Scanner;


public class Team {
    public static void main(String[] args) {
        int n,i,j,sum=0,res=0;

        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int arr[][] = new int[n][3];

        for(i=0;i<n;i++) {
            for(j=0;j<3;j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<n;i++) {
            for(j=0;j<3;j++) {
                sum += arr[i][j];
            }
            if(sum==2 || sum==3) {
                res += 1;
            }
            sum=0;
        }
        System.out.println(res);
    }
}

