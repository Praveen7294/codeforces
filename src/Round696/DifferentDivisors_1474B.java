package Round696;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DifferentDivisors_1474B {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int d = fs.nextInt();

            int div1 = 0;
            for (int i = d + 1; i < Integer.MAX_VALUE; i++) {
                if (isPrime(i)) {
                    div1 = i;
                    break;
                }
            }

            int div2 = 0;
            for (int i = div1 + d; i < Integer.MAX_VALUE; i++) {
                if (isPrime(i)) {
                    div2 = i;
                    break;
                }
            }

            System.out.println(div1 * div2);
        }
    }

    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
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