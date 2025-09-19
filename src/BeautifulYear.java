import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        int y,yn,flag;

        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();

        int[] y1;
        while (true) {
            flag=0;
            y = y + 1;
            yn = y;
            y1 = new int[4];
            for (int i = 0; i < 4; i++) {
                y1[3 - i] = yn % 10;
                yn = yn/10;
            }

            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++) {
                    if(y1[j]>y1[j+1]){
                        int temp = y1[j];
                        y1[j] = y1[j+1];
                        y1[j+1] = temp;
                    }
                }
            }

            for(int i=0;i<3;i++){
                if(y1[i]==y1[i+1]){
                    flag=1;
                    break;
                }
            }

            if(flag==0){
                System.out.println(y);
                break;
            }
        }
    }
}
