import java.util.Objects;
import java.util.Scanner;

public class HorseShoe_288A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s4 = sc.next();

        if(Objects.equals(s1,s2) && Objects.equals(s2,s3) && Objects.equals(s3,s4))
            System.out.println(3);
        else if(Objects.equals(s1,s2) && Objects.equals(s2,s3))
            System.out.println(2);
        else if(Objects.equals(s2,s3) && Objects.equals(s3,s4))
            System.out.println(2);
        else if(Objects.equals(s1,s2) && Objects.equals(s2,s4))
            System.out.println(2);
        else if(Objects.equals(s1,s3) && Objects.equals(s3,s4))
            System.out.println(2);
        else if(Objects.equals(s1,s4) && Objects.equals(s2,s3))
            System.out.println(2);
        else if(Objects.equals(s1,s2) && Objects.equals(s3,s4))
            System.out.println(2);
        else if(Objects.equals(s1,s3) && Objects.equals(s2,s4))
            System.out.println(2);
        else if(Objects.equals(s1,s2) || Objects.equals(s2,s3) || Objects.equals(s3,s4)
                || Objects.equals(s1,s3) || Objects.equals(s1,s4) || Objects.equals(s2,s4))
            System.out.println(1);
        else
            System.out.println(0);

    }
}
