import java.util.Scanner;

public class FairPlayOff_1535A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int[] playersSkills = new int[4];
            for (int i = 0; i < 4; i++) {
                playersSkills[i] = sc.nextInt();
            }

            if(Math.max(playersSkills[0], playersSkills[1]) < Math.min(playersSkills[2], playersSkills[3])
                    || Math.min(playersSkills[0], playersSkills[1]) > Math.max(playersSkills[2], playersSkills[3])) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
        }
    }
}
