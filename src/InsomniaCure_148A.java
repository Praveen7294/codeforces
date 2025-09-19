import java.util.Scanner;

public class InsomniaCure_148A {
    public static void main(String[] args) {
        int count=0;

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();

        for(int i=1;i<=d;i++){
            if(i%k==0){
                count++;
            } else if(i%l==0){
                count++;
            } else if(i%m==0){
                count++;
            } else if(i%n==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
