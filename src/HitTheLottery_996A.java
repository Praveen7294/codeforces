import java.util.Scanner;

public class HitTheLottery_996A {
    public static void main(String[] args) {
        int count=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n>0){
            if(n>=100) {
                n = n - 100;
                count++;
            } else if(n>=20) {
                n = n - 20;
                count++;
            }else if(n>=10) {
                n = n - 10;
                count++;
            } else if(n>=5) {
                n = n - 5;
                count++;
            } else {
                n = n - 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
