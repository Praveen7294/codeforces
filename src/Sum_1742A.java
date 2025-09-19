import java.util.Arrays;
import java.util.Scanner;

public class Sum_1742A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] num = new int[3];

        while(t-->0){
            for(int i=0;i<3;i++)
                num[i]=sc.nextInt();

            Arrays.sort(num);

            if (num[2] == num[0]+num[1])
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
