import java.util.ArrayList;
import java.util.Scanner;

public class DoNotBeDistracted_1520A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            boolean flag = false;
            ArrayList<Character> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                if( i==0 ) list.add(s.charAt(i));
                else if(!list.contains(s.charAt(i))) list.add(s.charAt(i));
                else if( s.charAt(i-1) != s.charAt(i) && list.contains(s.charAt(i))) {
                    flag = true;
                    break;
                }
            }
            if(flag) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
