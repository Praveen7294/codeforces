import java.util.Scanner;

public class RegistrationSystem_4C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        int count=0;
        boolean flag=false;

        for(int i=0;i<n;i++)
            s[i] = sc.next();

        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(s[i].equals(s[j])){
                    count++;
                    flag = true;
                }
            }
            if(flag){
                System.out.println(s[i]+""+count);
            } else {
                System.out.println("OK");
            }
            flag = false;
            count=0;
        }
    }
}
