import java.util.Scanner;

public class TrippiTroppi_2094A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            System.out.println(
                    String.valueOf(sc.next().charAt(0))
                            + sc.next().charAt(0)
                            + sc.next().charAt(0));
        }
    }
}
