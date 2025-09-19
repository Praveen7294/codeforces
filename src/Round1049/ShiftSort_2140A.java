package Round1049;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ShiftSort_2140A {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            String s = fs.next();

            int zeroCount = 0;

            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == '0') {
                    zeroCount++;
                }
            }

            int ans = zeroCount;
            for (int i = 0; i < zeroCount; i++) {
                char ch = s.charAt(i);
                if (ch == '1') {
                    ans--;
                }
            }

            System.out.println(zeroCount - ans);
        }
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

    public String next() throws IOException {
        StringBuilder sb = new StringBuilder();
        byte c = skip();
        do {
            sb.append((char) c);
            c = read();
        } while (c > ' ');
        return sb.toString();
    }
}
