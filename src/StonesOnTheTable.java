import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        int x,i,count=0;
        String s;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        s = sc.next();

        if(s.length()==x) {
            for (i=0;i<x-1;i++){
                if(s.charAt(i) == s.charAt(i+1)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
