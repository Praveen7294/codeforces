import java.util.Scanner;

public class Football_43A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] goal = new String[t];
        String team1 = "", team2 = "";
        int goal1 = 0, goal2 = 0;

        for(int i=0;i<t;i++){
            goal[i] = sc.next();

            if(i>0 && !goal[i - 1].equals(goal[i])){
                team1 = goal[i-1];
                team2 = goal[i];
            }
        }

        for(int i=0;i<t;i++){
            if(goal[i].equals(team1)) goal1++;
            else goal2++;
        }

        if(t==1 || team1.equals("")) System.out.println(goal[0]);
        if(t>1 && goal1>goal2 && !team1.equals("")) System.out.println(team1);
        else if(t>1 && goal1<goal2 && !team2.equals("")) System.out.println(team2);
    }
}
