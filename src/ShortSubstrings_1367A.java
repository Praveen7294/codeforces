import java.util.Scanner;

public class ShortSubstrings_1367A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            String s = sc.next();
            String new_s = "";

            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    new_s += s.charAt(i);
                    i++;
                }
                else {
                    new_s += s.charAt(i);
                }
            }
            new_s += s.charAt(s.length()-1);
            System.out.println(new_s);
        }
    }
}
