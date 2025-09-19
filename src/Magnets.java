import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
        int count=1;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            if(arr[i] != arr[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
