import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class JzzhuAndChildren_450A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] children = new int[n];
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        for (int i = 0; i < n; i++) {
            children[i] = sc.nextInt();
            queue.add(i);
        }

        int res = 0;
        for (int i : queue) {
            if (children[i] <= m) {
                queue.remove(i);
            } else {
                queue.remove(i);
                children[i] -= m;
                queue.add(i);
            }
            res = i;
        }
        System.out.println(res + 1);
    }
}
