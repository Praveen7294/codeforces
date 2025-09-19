import java.util.Scanner;

public class NormalProblem_2044B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            char[] a = sc.next().toCharArray();

            StringBuilder b = new StringBuilder();
            for (int i = (a.length - 1); i >= 0; i--) {
                if (a[i] == 'p') {
                    b.append('q');
                } else if (a[i] == 'q') {
                    b.append('p');
                } else {
                    b.append('w');
                }
            }
            System.out.println(b);
        }
    }
}
