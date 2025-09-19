import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        int minc;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] box = new int[n+1];

        for(int i=1;i<=n;i++){
            int c = sc.nextInt();
            box[i] = c;
        }

        minc = box[1];
        for(int i=1;i<=n;i++){
            if(box[i]<minc){
                minc = box[i];
            }
        }

        for(int i=1;i<=n;i++){
            box[i] -= minc;
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                if(box[j]>box[j+1]){
                    int temp = box[j];
                    box[j] = box[j+1];
                    box[j+1] = temp;
                }
            }
        }

        for(int i=1;i<=n;i++){
            box[i] += minc;
        }

        for(int i=1;i<=n;i++){
            System.out.print(box[i]+" ");
        }
    }
}
