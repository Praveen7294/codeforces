import java.util.Scanner;

public class TwoArraysAndSwap_1353B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for(int i=0;i<n;i++)
                a[i] = sc.nextInt();

            int[] b = new int[n];
            for(int i=0;i<n;i++)
                b[i] = sc.nextInt();

            int sum=0;
            while (k-->0){
                int minIndex = minIndex(a);
                int maxIndex = maxIndex(b);
                if( a[minIndex] < b[maxIndex]){
                    int temp = a[minIndex];
                    a[minIndex] = b[maxIndex];
                    b[maxIndex] = temp;
                }
            }

            for(int i:a) sum += i;
            System.out.println(sum);
        }
    }

    static int maxIndex(int[] arr){
        int max = arr[0];
        int res = 0;
        for(int i=1;i<arr.length;i++)
            if( arr[i] > max){
                res = i;
                max = arr[i];
            }
        return res;
    }

    static int minIndex(int[] arr){
        int min = arr[0];
        int res =0;
        for(int i=0;i<arr.length;i++)
            if( arr[i] < min){
                res = i;
                min = arr[i];
            }
        return res;
    }
}
