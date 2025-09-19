import java.util.Scanner;

public class XeniaAndRingroad_339B {
    public static void main(String[] args) {
        int n,m;
        long count=0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int pos = 1;

        for(int i=0;i<m;i++){
            int now = sc.nextInt();
            if(now>=pos){
                count += now-pos;
            }
            else {
                count += n - (pos-now);
            }
            pos=now;
        }
        System.out.println(count);
    }
}
