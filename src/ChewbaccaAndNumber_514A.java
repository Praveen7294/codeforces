import java.util.Scanner;
import java.util.Stack;

public class ChewbaccaAndNumber_514A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(find(n));
    }

    static long find(long n){
        if(n == 9) return 9;

        Stack<Long> stack = new Stack<>();

        while ( n > 0){
            long t = n%10;
            if( 9-t < t){
                if(t == 9 && n/10 == 0) stack.push(t);
                else stack.push(9-t);
            }
            else stack.push(t);
            n /= 10;
        }

        long new_num = 0;
        while (!stack.isEmpty()){
            long i = stack.pop();
            new_num = new_num * 10 + i;
        }
        return new_num;
    }
}
