import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        int x=0,y=0,z=0 ,n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while (n-->0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int z1 = sc.nextInt();

            x += x1;
            y += y1;
            z += z1;
        }
        if(x == 0 && y==0 && z==0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
