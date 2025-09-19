package Round634;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

public class TwoTeamsComposing_1335C {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int temp = fs.nextInt();

                if (i == 0) {
                    map.put(temp, 1);
                } else if (map.containsKey(temp)) {
                    int val = map.get(temp) + 1;
                    map.put(temp, val);
                } else {
                    map.put(temp, 1);
                }
            }

            int max = 0;
            for(int i : map.keySet()) {
                if (map.get(i) > max) {
                    max = map.get(i);
                }
            }

            int distEle = map.size();

            if (distEle > 1 || distEle == 1 && max > 1) {
                if (distEle > max) {
                    System.out.println(max);
                } else if (distEle < max) {
                    System.out.println(distEle);
                } else {
                    System.out.println(distEle - 1);
                }
            } else {
                System.out.println(0);
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
