import java.util.Scanner;

public class Dubstep_208A {
    public static void main(String[] args) {
        String output = "";

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s += "00";

        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)=='W' && s.charAt(i+1)=='U' && s.charAt(i+2)=='B'){
                i += 2;
            } else {
                output += s.charAt(i);
                if(s.charAt(i+1)=='W' && s.charAt(i+2)=='U' && s.charAt(i+3)=='B'){
                    output += ' ';
                }
            }
        }
        System.out.println(output);
    }
}
