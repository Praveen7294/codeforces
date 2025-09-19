import java.util.Scanner;

public class Twins {
    public static void main(String[] args) {
        int count=0,sumb=0,summ=0,k=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] darr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=n-1;i>0;i--){
            for(int j=n-1;j>0;j--){
                if(arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        System.arraycopy(arr, 0, darr, 0, n);

        for(int i=0;i<n;i++){
            sumb += arr[i];
        }

        while (sumb >= summ){
            sumb -= darr[k];
            summ += darr[k];
            count++;
            darr[k] = 0;
            k++;
        }
        System.out.println(count);
    }
}
