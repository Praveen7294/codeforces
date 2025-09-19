import java.util.Scanner;

public class EvenArray_1367B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();

            int[] arr = new int[n];
            boolean flag = true;

            int count1 = 0, count0 = 0;
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();

                if( i % 2 != arr[i] % 2 ){
                    flag = false;
                    if( arr[i] % 2 == 0) count0++;
                    if( arr[i] % 2 == 1) count1++;
                }
            }
            if(flag) System.out.println(0);
            else if(count0 == count1) System.out.println(count0);
            else System.out.println(-1);
        }
    }
}
