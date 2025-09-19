import java.util.Scanner;

public class DieRoll_9A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int w = sc.nextInt();

        int max = Math.max(y,w),count=0;

        for(int i=max;i<=6;i++){
            count++;
        }

        double prob = count/6.0;

        int a=count,b=6;

        if( count % 2 == 0){
            a = count/2;
            b = 6/2;
        }
        if(count % 3 == 0){
            a = count/3;
            b = 6/3;
        }

        if(prob == 9) System.out.println("0/1");
        else if(prob == 1) System.out.println("1/1");
        else System.out.println(a+"/"+b);
    }
}
