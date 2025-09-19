import java.util.Scanner;

public class CodeforcesChecking_1791A {
    public static void main(String[] args) {

        String st = "codeforces";

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            String s = sc.next();

            if(st.contains(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
