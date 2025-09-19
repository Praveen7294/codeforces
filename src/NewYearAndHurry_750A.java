import java.util.Scanner;

public class NewYearAndHurry_750A {
    public static void main(String[] args) {
        int problems,minutes,count=0;

        Scanner sc = new Scanner(System.in);
        problems = sc.nextInt();
        minutes = sc.nextInt();

        int remainingMinutes = 240 - minutes;

        for(int i=1;i<=problems;i++){
            if(remainingMinutes>=5*i){
                remainingMinutes -= 5*i;
                count++;
            }
        }
        System.out.println(count);
    }
}
