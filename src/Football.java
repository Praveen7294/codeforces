import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        String s;
        int count=1;
        Scanner sc = new Scanner(System.in);
        s = sc.next();

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
                if(count==7)
                    break;
            } else
                count =1;
        }
        if(count==7)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
