import java.util.Scanner;

public class PoliceRecruits_427A {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] events = new int[n];
        int policeForce =0,untreated=0;

        for(int i=0;i<n;i++){
            events[i] = sc.nextInt();
            if(events[i]>0)
                policeForce += events[i];
            else if(policeForce>0)
                policeForce += events[i];
            else
                untreated++;
        }
        System.out.println(untreated);
    }
}
