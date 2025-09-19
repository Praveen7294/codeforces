import java.util.Scanner;

public class Lecture_499B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ProfessorWords[] professorWords = new ProfessorWords[m];
        for (int i = 0; i < m; i++) {
            String a = sc.next();
            String b = sc.next();

            professorWords[i] = new ProfessorWords(a, b);
        }

        sc.nextLine();
        String[] notes = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (notes[i].equals(professorWords[j].a)
                        && professorWords[j].a.length() > professorWords[j].b.length()) {
                    notes[i] = professorWords[j].b;
                }
            }
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < n - 1; i++) {
            s.append(notes[i]).append(" ");
        }
        s.append(notes[n - 1]);
        System.out.println(s);
    }
}

class ProfessorWords {
    String a;
    String b;

    ProfessorWords(String a, String b) {
        this.a = a;
        this.b = b;
    }
}