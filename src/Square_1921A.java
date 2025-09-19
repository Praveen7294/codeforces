import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Square_1921A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            Coordinates[] coordinates = new Coordinates[4];
            for (int i = 0; i < 4; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                coordinates[i] = new Coordinates(x, y);
            }

            Arrays.sort(coordinates, Comparator.comparing(p -> p.y));

            int side1 = coordinates[1].x - coordinates[0].x;

            System.out.println(side1 * side1);
        }
    }
}

class Coordinates {
    int x;
    int y;

    Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
