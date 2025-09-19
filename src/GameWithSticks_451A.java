import java.util.Scanner;

public class GameWithSticks_451A {
    public static void main(String[] args) {
        int n,m;
        String player1 = "Akshat" , player2 = "Malvika";
        boolean flag = true;
        int i=1;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int points = n*m;

        while(flag){
            switch (i) {
                case 1 -> {
                    if (n >= 1 && m >= 1) {
                        points -= (n + m - 1);
                        n -= 1;
                        m -= 1;
                    }
                    if (points == 0) {
                        System.out.println(player1);
                        flag = false;
                    }
                    i = 2;
                }
                case 2 -> {
                    if (n >= 1 && m >= 1) {
                        points -= (n + m - 1);
                        n -= 1;
                        m -= 1;
                    }
                    if (points == 0) {
                        System.out.println(player2);
                        flag = false;
                    }
                    i = 1;
                }
            }
        }

    }
}
