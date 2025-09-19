import java.util.Scanner;

public class CheapTravel_466A {
    public static void main(String[] args) {
        int n, a, m, b, cost;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        int numTicketM = n/m;
        int remRides = n % m;

        cost = Math.min(numTicketM * b + remRides * a, (numTicketM+1) * b);
        cost = Math.min(cost , n * a);
        System.out.println(cost);

    }
}
