import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args) {
        int n,t;
        String s="";
        char temp;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();

        if(n>0){
            s = sc.next();
        }

        char[] ch = new char[s.length()];
        for(int i=0;i<n;i++){
            ch[i]=s.charAt(i);
        }

        while (t-->0) {
            for(int i=0;i<n-1;i++){
                if(ch[i]=='B' && ch[i+1]=='G'){
                    temp = ch[i];
                    ch[i] = ch[i+1];
                    ch[i+1] = temp;
                    i++;
                }
            }
        }
        System.out.println(ch);
    }
}
