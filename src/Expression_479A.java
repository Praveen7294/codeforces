import java.util.Scanner;

public class Expression_479A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] res = new int[6];

        res[0] = a * b + c;
        res[1] = a + b * c;
        res[2] = (a + b)* c;
        res[3] = a *(b + c);
        res[4] = a * b * c;
        res[5] = a + b + c;

        int max = res[0];
        for(int i=1;i<6;i++)
            if(max<res[i])
                max = res[i];

        System.out.println(max);
    }
}
