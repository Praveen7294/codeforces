import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheNumberOfPositions_124A {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int a = Integer.parseInt(s[1]);
        int b = Integer.parseInt(s[2]);

        if (n - a > b) {
            System.out.println(b + 1);
        } else {
            System.out.println(n - a);
        }
    }
}
