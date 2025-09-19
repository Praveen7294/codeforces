import java.util.Arrays;
import java.util.Scanner;

public class TheNewYear_723A {
    public static void main(String[] args) {
        int[] x = new int[3];

        Scanner sc = new Scanner(System.in);
        for (int i=0;i<3;i++)
            x[i] = sc.nextInt();

        Arrays.sort(x);

        int d1 = x[1] - x[0];
        int d2 = x[2] - x[1];

        System.out.println(d1+d2);
    }
}
