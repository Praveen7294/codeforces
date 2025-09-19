package Round971;

import java.util.Scanner;

public class Osumania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int rows = sc.nextInt();

            String[] strings = new String[rows];
            for (int i = 0; i < rows; i++) {
                strings[i] = sc.next();
            }

            for (int i = rows-1; i >= 0 ; i--) {
                for (int j = 0; j < strings[i].length(); j++) {
                    if(strings[i].charAt(j) == '#')
                        System.out.print(j+1 + " ");
                }
            }
            System.out.println();
        }
    }
}
