import java.util.Scanner;

public class RoadToZero_1342A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (x == 0 && y == 0) {
                System.out.println(0);
                continue;
            }
            long totalCostA = ((long)x * a) + ((long)y * a);

            long totalCost = 0;
            if (x > 0 && y > 0) {
                int min = Math.min(x, y);
                x -= min;
                y -= min;
                totalCost += ((long)min * b);
            }
            if (x > 0) {
                totalCost += ((long)x * a);
            }
            if (y > 0) {
                totalCost += ((long)y * a);
            }
            System.out.println(Math.min(totalCostA, totalCost));
        }
    }
}
