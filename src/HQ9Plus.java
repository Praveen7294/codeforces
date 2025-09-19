import java.util.Scanner;

public class HQ9Plus {
    public static void main(String[] args) {
        int flag=0;

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'H'){
                System.out.println("YES");
                flag=1;
                break;
            } else if(s.charAt(i) == 'Q'){
                System.out.println("YES");
                flag=1;
                break;
            } else if(s.charAt(i) == '9') {
                System.out.println("YES");
                flag=1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("NO");
    }
}
