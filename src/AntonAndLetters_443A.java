import java.util.Scanner;

public class AntonAndLetters_443A {
    public static void main(String[] args) {
        int count=0;

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.substring(1,s.length()-1);
        s = s.replace(",","");
        s = s.replace(" ","");

        for(char i='a';i<='z';i++){
            if(s.contains(String.valueOf(i)))
                count++;
        }
        System.out.println(count);
    }
}
