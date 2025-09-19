import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem1_4C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> database = new HashMap<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String input = sc.next();
            if(database.containsKey(input)){
                int x = database.get(input);
                x++;
                database.put(input,x);
                System.out.println(input+x);
            }
            else {
                database.put(input,0);
                System.out.println("OK");
            }
        }
    }
}
