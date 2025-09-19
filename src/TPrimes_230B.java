import java.util.Scanner;

public class TPrimes_230B {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n-- > 0) {
            long num = sc.nextLong();

            if(num == 4) {
                System.out.println("YES");
            }
            else if (num > 4 && num % 2 != 0 && isInteger(Math.sqrt(num))) {
                int requiredRoot = (int) Math.sqrt(num);
                if (isPrime(requiredRoot)) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else {
                System.out.println("NO");
            }
        }
    }

    public static boolean isInteger(double number) {
        return number == Math.floor(number) && !Double.isInfinite(number);
    }

//    // Exceed time limit
//    public static boolean isPrime(int number) {
//        for (int i = 2; i <= Math.sqrt(number); i++) {
//            if(number % i == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static boolean isPrime(int n) {

        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
        if (n % i == 0 || n % (i + 2) == 0)
            return false;
    }
    return true;
    }
}
