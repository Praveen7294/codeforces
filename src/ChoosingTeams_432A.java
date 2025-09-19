import java.util.Scanner;

public class ChoosingTeams_432A {
    public int choosingTeam(int[] students, int n, int k){
        int count=0,res=0;

        int[] remChance = new int[n];

        for(int i=0;i<n;i++){
            remChance[i] = 5 - students[i];

            if(remChance[i] >= k)
                count++;
            if(count == 3){
                res++;
                count = 0;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] students = new int[n];

        for(int i=0;i<n;i++){
            students[i] = sc.nextInt();
        }

        ChoosingTeams_432A c = new ChoosingTeams_432A();
        System.out.println(c.choosingTeam(students, n, k));
    }
}
