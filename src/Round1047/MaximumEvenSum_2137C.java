package Round1047;

public class MaximumEvenSum_2137C {
    public static void main(String[] args) throws Exception {

        FastScanner fs = new FastScanner();
        int t = fs.nextInt();

        while (t-- > 0) {
            long a = fs.nextLong();
            long b = fs.nextLong();

            long best = -1;
            for (long i = 1; i * i <=  b; i++) {
                if (b % i == 0) {
                    long k2 = b / i;

                    long bDummy = b / i;
                    long aDummy = a * i;
                    if ((aDummy + bDummy) % 2 == 0) {
                        best = Math.max(best, (aDummy + bDummy));
                    }

                    bDummy = b / k2;
                    aDummy = a * k2;
                    if ((aDummy + bDummy) % 2 == 0) {
                        best = Math.max(best, (aDummy + bDummy));
                    }
                }
            }
            System.out.println(best);
        }
    }
}
