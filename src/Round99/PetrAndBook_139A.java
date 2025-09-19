package Round99;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class PetrAndBook_139A {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int n = fs.nextInt();

        int[] arr = new int[7];
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            arr[i] = fs.nextInt();
            sum += arr[i];
        }

        int rem;

        if (n % sum == 0) {
            int q = n / sum;
            rem = n - ((q - 1) * sum);
        } else {
            rem = n % sum;
        }

        int res = 0;
        for (int i = 0; i < 7; i++) {
            if (rem - arr[i] > 0) {
                rem -= arr[i];
            } else {
                res = i + 1;
                break;
            }
        }
        System.out.println(res);
    }
}

class FastScanner {
    private static final int BUFFER_SIZE = 1 << 16; // 64 KB
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
