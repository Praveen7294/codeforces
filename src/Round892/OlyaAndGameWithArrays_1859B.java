package Round892;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OlyaAndGameWithArrays_1859B {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();

            List<int[]> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int m = fs.nextInt();
                int[] arr = new int[m];

                for (int j = 0; j < m; j++) {
                    arr[j] = fs.nextInt();
                }

                list.add(arr);
            }

            for (int[] arr : list) {
                Arrays.sort(arr);
            }

            long sum = 0;
            int minSecond = Integer.MAX_VALUE;
            int minFirst = Integer.MAX_VALUE;

            for (int[] arr : list) {
                minFirst = Math.min(minFirst, arr[0]);
                minSecond = Math.min(minSecond, arr[1]);
                sum += arr[1];
            }

            System.out.println((sum - minSecond) + minFirst);
        }
    }
}

class FastScanner {
    private static final int BUFFER_SIZE = 1 << 21; // 2 MB
    private final DataInputStream din;
    private final byte[] buffer;
    private int bufferPointer, bytesRead;

    public FastScanner() {
        this(System.in);
    }

    public FastScanner(InputStream in) {
        din = new DataInputStream(in);
        buffer = new byte[BUFFER_SIZE];
        bufferPointer = bytesRead = 0;
    }

    private byte read() throws IOException {
        if (bufferPointer == bytesRead) {
            bytesRead = din.read(buffer, 0, BUFFER_SIZE);
            bufferPointer = 0;
            if (bytesRead == -1) return -1;
        }
        return buffer[bufferPointer++];
    }

    private byte skip() throws IOException {
        byte c;
        while ((c = read()) <= ' ') {
            if (c == -1) return -1;
        }
        return c;
    }

    public int nextInt() throws IOException {
        int ret = 0;
        byte c = skip();
        boolean neg = (c == '-');
        if (neg) c = read();
        do {
            ret = ret * 10 + (c - '0');
        } while ((c = read()) >= '0' && c <= '9');
        return neg ? -ret : ret;
    }
}
