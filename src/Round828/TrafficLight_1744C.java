package Round828;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class TrafficLight_1744C {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();
            char c = fs.next().charAt(0);
            String s = fs.next();

            ArrayList<Integer> symbol = new ArrayList<>();
            ArrayList<Integer> green = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if (ch == c) {
                    symbol.add(i);
                }
                if (ch == 'g') {
                    green.add(i);
                }
            }

            int k = 0;
            int max = 0;
            for (int idxS : symbol) {
                while (k < green.size() && idxS > green.get(k)) {
                    k++;
                }

                if (k < green.size()) {
                    max = Math.max(max, green.get(k) - idxS);
                } else {
                    max = Math.max(max, ((n - idxS) + green.get(0)));
                }
            }
            System.out.println(max);
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
