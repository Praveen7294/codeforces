import java.math.BigInteger;
import java.util.Scanner;

public class OlesyaAndRodion_584A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        BigInteger start = BigInteger.TEN.pow(n - 1);
        BigInteger end = BigInteger.TEN.pow(n);

        boolean flag = false;
        for (BigInteger i = start; i.compareTo(end) < 0; i = i.add(BigInteger.ONE)) {
            BigInteger[] res = i.divideAndRemainder(BigInteger.valueOf(t));
            if (res[1].compareTo(BigInteger.ZERO) == 0) {
                System.out.println(i);
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println(-1);
        }
    }
}
