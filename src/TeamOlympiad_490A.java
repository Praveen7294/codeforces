import java.util.Scanner;
import java.util.Stack;

public class TeamOlympiad_490A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Stack<Integer> proG = new Stack<>();
        Stack<Integer> math = new Stack<>();
        Stack<Integer> phyE = new Stack<>();

        for(int i=0;i<n;i++){
            int x = sc.nextInt();

            if(x == 1) proG.push(i+1);
            else if(x == 2) math.push(i+1);
            else if(x == 3) phyE.push(i+1);
        }

        TeamOlympiad_490A t = new TeamOlympiad_490A();
        int w = t.min(proG.size(), math.size(), phyE.size());
        System.out.println(w);

        for(int i=0;i<w;i++){
            System.out.print(proG.pop()+ " ");
            System.out.print(math.pop()+ " ");
            System.out.print(phyE.pop()+ " ");
            System.out.println();
        }
    }

    int min(int a, int b, int c){
        int min = Math.min(a,b);
        return Math.min(min,c);
    }
}


