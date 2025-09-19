package Round962;

import java.util.Scanner;

public class Legs_1996A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int totalAnimal = 0;
            int remLegs = 0;

            if(n >= 4) {
                totalAnimal += n / 4;
                remLegs = n % 4;
            } else {
                totalAnimal += n / 2;
            }
            totalAnimal += remLegs / 2;

            System.out.println(totalAnimal);
        }
    }
}
