package Round878;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SkiResort_1840C {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();
            int q = fs.nextInt();

            int count = 0;
            long res = 0;
            for (int i = 1; i <= n; i++) {
                int temp = fs.nextInt();
                if (temp <= q) {
                    count++;
                } else {
                    int r = (count - k + 1);
                    if (r > 0) {
                        res += ((long) r * (r + 1) / 2);
                    }
                    count = 0;
                }
            }
            int r = (count - k + 1);
            if (r > 0) {
                res += ((long) r * (r + 1) / 2);
            }
            System.out.println(res);
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
