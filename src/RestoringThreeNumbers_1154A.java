import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers_1154A {
    public static void main(String[] args) {
        long[] num = new long[4];

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++)
            num[i] = sc.nextInt();

        Arrays.sort(num);

        long max = num[3];
        long a,b,c;
        a = max - num[0];
        b = max - num[1];
        c = max - num[2];
        System.out.println(a+" "+b+" "+c);
    }
}
