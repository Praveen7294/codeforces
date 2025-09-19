import java.util.Scanner;
import java.util.Stack;

public class MoveBrackets_1374C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);

                if (stack.isEmpty()) {
                    stack.push(c);
                } else if (stack.peek() == '(' && c == ')') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            int size = stack.size();
            System.out.println(size / 2);
        }
    }
}
