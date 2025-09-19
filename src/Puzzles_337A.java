import java.util.Scanner;

public class Puzzles_337A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        int[] res = new int[m-n+1];

        for (int i = 0; i < m; i++)
            p[i] = sc.nextInt();

        for (int i = 0; i < m - 1; i++)
            for (int j = 0; j < m - 1; j++)
                if (p[j] > p[j + 1]) {
                    int temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }

        for(int j=0;j<m;j++){
            if(j+(n-1)>=m)
                break;
            int temp = p[j+(n-1)]-p[j];
            res[j] = temp;
        }

        int min=res[0];
        for(int i=0;i<m-n+1;i++)
            if(min>res[i])
                min = res[i];

        System.out.println(min);
    }
}




