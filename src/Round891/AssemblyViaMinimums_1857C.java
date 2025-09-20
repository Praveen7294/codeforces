package Round891;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AssemblyViaMinimums_1857C {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            int n = fs.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();
            Set<Integer> set = new TreeSet<>();
            int m = (n * (n - 1)) / 2;
            for (int i = 0; i < m; i++) {
                int temp = fs.nextInt();
                map.putIfAbsent(temp, 0);
                map.put(temp, map.get(temp) + 1);
                set.add(temp);
            }

            List<Integer> list = new ArrayList<>();
            int i = 1;
            for (int temp : set) {
                int val = map.get(temp);
                while (i < n && val > n - i) {
                    list.add(temp);
                    val -= n - i;
                    i++;
                }
                if (val > 0) {
                    list.add(temp);
                    i++;
                }
            }

            while (list.size() < n) {
                list.add(1000000000);
            }
            for (int k : list) {
                System.out.print(k + " ");
            }
            System.out.println();
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