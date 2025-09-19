import java.util.Scanner;

public class HolidayOfEquality_758A {
    public int equality(int[] a, int n){
        int res = 0;

        int max = Max(a , n);

        for(int i=0;i<n;i++){
            res += (max - a[i]);
        }
        return res;
    }

    int Max(int[] a, int n){
        int max = a[0];
        for(int i=0;i<n;i++){
            if(max < a[i]) max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();

        HolidayOfEquality_758A h = new HolidayOfEquality_758A();
        System.out.println(h.equality(a , n));
    }
}
