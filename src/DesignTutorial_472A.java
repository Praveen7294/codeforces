import java.util.Scanner;

public class DesignTutorial_472A {
    public static boolean iSComposite(int n){
        boolean flag = false;

        for(int i=2;i<(n/2)+1;i++){
            if (n % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2;i<n;i++){
            if(iSComposite(i)){
                if(iSComposite(n-i)) {
                    System.out.println(i + " " + (n - i));
                    break;
                }
            }
        }
    }
}
