package Round360;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LovelyPalindromes_688B {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        String s = fs.next();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        System.out.println(s + sb);
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
