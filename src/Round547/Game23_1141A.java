package Round547;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Game23_1141A {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int m = fs.nextInt();

        if (n == m) {
            System.out.println(0);
            return;
        }

        double q = (double) m / n;

        if (q != (int) q) {
            System.out.println(-1);
        } else {
            int count = 0;

            while (q % 6 == 0) {
                q /= 6;
                count += 2;
            }
            while (q % 2 == 0) {
                q /= 2;
                count++;
            }
            while (q % 3 == 0) {
                q /= 3;
                count++;
            }

            if (q == 1) {
                System.out.println(count);
            } else {
                System.out.println(-1);
            }
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
