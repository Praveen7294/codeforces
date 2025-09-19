import java.util.Scanner;

public class BuyShovel_732A {
    public static void main(String[] args) {
        int k,r;

        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        r = sc.nextInt();

        for(int i=1;i<10;i++){
            int amount = k*i;
            if(amount%10==r){
                System.out.println(i);
                break;
            }
            else if(amount%10==0){
                System.out.println(i);
                break;
            }
        }
    }
}
