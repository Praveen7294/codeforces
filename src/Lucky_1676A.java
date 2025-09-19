import java.util.Scanner;

public class Lucky_1676A {
    public String lucky(String s){
        int f = Integer.parseInt(String.valueOf(s.charAt(0))) +
                Integer.parseInt(String.valueOf(s.charAt(1))) +
                Integer.parseInt(String.valueOf(s.charAt(2)));

        int l = Integer.parseInt(String.valueOf(s.charAt(3))) +
                Integer.parseInt(String.valueOf(s.charAt(4))) +
                Integer.parseInt(String.valueOf(s.charAt(5)));

        if( f == l) return "YES";
        return "NO";
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            String s = sc.next();

            Lucky_1676A l = new Lucky_1676A();
            System.out.println(l.lucky(s));
        }
    }
}
