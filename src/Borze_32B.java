import java.util.Scanner;

public class Borze_32B {
    public static void main(String[] args) {
        String s,res="";

        Scanner sc = new Scanner(System.in);
        s = sc.next();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='.'){
                res += '0';
            }
            else if(s.charAt(i)=='-' && s.charAt(i+1)=='.'){
                res += '1';
                i++;
            }
            else if(s.charAt(i)=='-' && s.charAt(i+1)=='-'){
                res += '2';
                i++;
            }
        }
        System.out.println(res);
    }
}
