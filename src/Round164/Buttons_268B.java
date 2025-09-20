package Round164;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Buttons_268B {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int n = fs.nextInt();

//        long sum = 0;
//        for (int i = 1; i < n; i++) {
//            sum += ((long) n - i) * i;
//        }
//        sum += n;
//        System.out.println(sum);

        // 1*(n-1)+1 + 2*(n-2)+1 + 3*(n-3)+1 + ... + n*(n-n)+1
        // solution of above equation is ((n * n * n) + 5 * n) / 6
        long num = (long) n * n * n;
        System.out.println((num + ((long) 5 * n)) / 6);
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
