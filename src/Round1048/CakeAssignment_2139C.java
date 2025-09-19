package Round1048;

import java.util.ArrayDeque;

public class CakeAssignment_2139C {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            int k = fs.nextInt();
            int x = fs.nextInt();

            ArrayDeque<Integer> stack = getIntegers(k, x);

            out.append(stack.size()).append("\n");
            while (!stack.isEmpty()) {
                out.append(stack.pop());
                if (!stack.isEmpty()) out.append(" ");
            }
            out.append("\n");
        }

        System.out.print(out);
    }

    private static ArrayDeque<Integer> getIntegers(int k, int x) {
        long total = 1L << (k + 1);
        long c = x;
        long v = total - x;

        long start = 1L << k;

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (!(c == start && v == start)) {
            if (v >= c) {
                long tmp = c;
                c = c * 2;
                v = v - tmp;
                stack.push(1);
            } else {
                long tmp = v;
                v = v * 2;
                c = c - tmp;
                stack.push(2);
            }
        }
        return stack;
    }
}
