package Round886;

import java.util.Scanner;

public class WordOnThePaper_1850C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String[] grid = new String[8];

            for (int i = 0; i < 8; i++) {
                grid[i] = sc.next();
            }

            StringBuilder word = new StringBuilder();
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (grid[i].charAt(j) != '.') {
                        word.append(grid[i].charAt(j));
                    }
                }
            }
            System.out.println(word);
        }
    }
}
