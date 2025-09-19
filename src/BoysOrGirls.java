import java.util.Scanner;

public class BoysOrGirls {
    public static void main(String[] args) {
        String s;
        char temp;
        int i,j,count=1;

        Scanner sc = new Scanner(System.in);
        s = sc.next();
        s = s.toLowerCase();

        char[] ch = new char[s.length()];
        for(i=0;i<s.length();i++) {
            ch[i] = s.charAt(i);
        }

        for(i=s.length()-1;i>0;i--) {
            for(j=0; j<s.length()-1; j++) {
                if(ch[j] > ch[j+1]) {
                    temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1]=temp;
                }
            }
        }

        for(i=0;i<s.length()-1;i++) {
            if(ch[i] != ch[i+1]){
                count++;
            }
        }

        if(count % 2 != 0)
            System.out.println("IGNORE HIM!");
        else
            System.out.println("CHAT WITH HER!");
    }
}
