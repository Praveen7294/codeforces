package Round797;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BlackAndWhiteStripe_1690D {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            int k = fs.nextInt();
            String s = fs.next();

            int i = 0;
            int j = 0;
            int countWhite = 0;

            while (j < k) {
                char c = s.charAt(j);
                if (c == 'W') {
                    countWhite++;
                }
                j++;
            }
            j--;

            int min = countWhite;

            while (j < n - 1) {
                char right = s.charAt(j + 1);
                char left = s.charAt(i);

                if (right == 'W' && left == 'B') {
                    countWhite++;
                } else if (right == 'B' && left == 'W') {
                    countWhite--;
                }
                i++;
                j++;
                min = Math.min(min, countWhite);
            }
            System.out.println(min);
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