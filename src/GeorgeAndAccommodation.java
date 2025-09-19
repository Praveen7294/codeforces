import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        int count=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-->0){
            int p = sc.nextInt();
            int q = sc.nextInt();

            if(p<=q-2){
                count++;
            }
        }
        System.out.println(count);
    }
}
