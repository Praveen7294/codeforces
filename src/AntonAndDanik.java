import java.util.Scanner;

public class AntonAndDanik {
    public static void main(String[] args) {
        String s;
        int n,a=0,d=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.next();

        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'){
                a++;
            } else {
                d++;
            }
        }
        if(a>d) {
            System.out.println("Anton");
        } else if(a<d){
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}
