package Round261;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class PhasmakAndGarden_459A {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int x1 = fs.nextInt();
        int y1 = fs.nextInt();
        int x2 = fs.nextInt();
        int y2 = fs.nextInt();

        if (x1 == x2) {
            int cf = Math.abs(y2 - y1);
            System.out.println((x1 + cf) + " " + y1 + " " + (x2 + cf) + " " + y2);
        } else if(y1 == y2) {
            int cf = Math.abs(x1 - x2);
            System.out.println(x1 + " " + (y1 + cf) + " " + x2 + " " + (y2 + cf));
        } else if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            System.out.println(x1 + " " + y2 + " " + x2 + " " + y1);
        } else {
            System.out.println(-1);
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
}