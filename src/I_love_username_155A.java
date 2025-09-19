import java.util.Scanner;

public class I_love_username_155A {
    public static void main(String[] args) {
        int n,count=0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] Contest = new int[n];

        for(int i=0;i<n;i++)
            Contest[i] = sc.nextInt();

        int max,min;
        max = min = Contest[0];

        for(int i=1;i<n;i++){
            if(max<Contest[i]){
                max = Contest[i];
                count++;
            }
            if(min>Contest[i]){
                min = Contest[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
