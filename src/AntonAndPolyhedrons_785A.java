import java.util.Scanner;

public class AntonAndPolyhedrons_785A {
    public static void main(String[] args) {
        int res=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-->0){
            String s = sc.next();

            if(s.equals("Tetrahedron"))
                res += 4;
            if(s.equals("Cube"))
                res += 6;
            if(s.equals("Octahedron"))
                res += 8;
            if(s.equals("Dodecahedron"))
                res += 12;
            if(s.equals("Icosahedron"))
                res += 20;
        }
        System.out.println(res);
    }
}
