package Round898;

import java.util.Scanner;

public class TargetPractice_1873A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String[] target = new String[10];

            for (int i = 0; i < 10; i++) {
                target[i] = sc.next();
            }

            int totalPoints = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (target[i].charAt(j) == 'X' && ((i == 0 || i == 9) || (j == 0 || j == 9))) {
                        totalPoints += 1;
                    }
                    else if (target[i].charAt(j) == 'X' && ((i == 1 || i == 8) || (j == 1 || j == 8))) {
                        totalPoints += 2;
                    } else if (target[i].charAt(j) == 'X' && ((i == 2 || i == 7) || (j == 2 || j == 7))) {
                        totalPoints += 3;
                    } else if (target[i].charAt(j) == 'X' && ((i == 3 || i == 6) || (j == 3 || j == 6))) {
                        totalPoints += 4;
                    } else if (target[i].charAt(j) == 'X' && ((i == 4 || i == 5) || (j == 4 || j == 5))) {
                        totalPoints += 5;
                    }
                }
            }
            System.out.println(totalPoints);
        }
    }
}
