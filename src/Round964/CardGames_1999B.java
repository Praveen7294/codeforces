package Round964;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CardGames_1999B {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int a1 = fs.nextInt();
            int a2 = fs.nextInt();
            int b1 = fs.nextInt();
            int b2 = fs.nextInt();

            int suneet = 0;

            if ((a1 > b1 && a2 > b2) || (a1 > b1 && a2 == b2) || (a1 == b1 && a2 > b2)) {
                suneet++;
            }
            if ((a1 > b2 && a2 > b1) || (a1 > b2 && a2 == b1) || (a1 == b2 && a2 > b1)) {
                suneet++;
            }
            if ((a2 > b1 && a1 > b2) || (a2 > b1 && a1 == b2) || (a2 == b1 && a1 > b2)) {
                suneet++;
            }
            if ((a2 > b2 && a1 > b1) || (a2 > b2 && a1 == b1) || (a2 == b2 && a1 > b1)) {
                suneet++;
            }

            System.out.println(suneet);
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

