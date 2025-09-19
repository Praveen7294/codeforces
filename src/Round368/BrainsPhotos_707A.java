package Round368;

import java.util.HashSet;
import java.util.Scanner;

public class BrainsPhotos_707A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                set.add(sc.next());
            }
        }

        if(set.contains("C") || set.contains("M") || set.contains("Y")) {
            System.out.println("#Color");
        }
        else {
            System.out.println("#Black&White");
        }
    }
}
