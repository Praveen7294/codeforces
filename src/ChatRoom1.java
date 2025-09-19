import java.util.Scanner;

public class ChatRoom1 {
    public static void main(String[] args) {
        String s;
        String  check = "hello";
        int count=0;

        Scanner sc = new Scanner(System.in);
        s = sc.next();

        for(int i=0;i<s.length();i++){
            if(count == s.length()){
                break;
            }
            if(s.charAt(count)==check.charAt(count)){
                count++;
            }
        }
        if(count >= 5){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
