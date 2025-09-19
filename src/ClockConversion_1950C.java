import java.util.Scanner;

public class ClockConversion_1950C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String[] s = sc.next().split(":");
            String hours = s[0];
            String minutes = s[1];

            if (Integer.parseInt(hours) < 12) {
                if (Integer.parseInt(hours) == 0) {
                    hours = "12";
                }
                System.out.println(hours + ":" + minutes + " AM");
            } else {
                if (Integer.parseInt(hours) > 12) {
                    int temp = Integer.parseInt(hours) - 12;
                    if (temp < 10) {
                        hours = "0" + temp;
                    } else {
                        hours = String.valueOf(temp);
                    }
                }
                System.out.println(hours + ":" + minutes + " PM");
            }
        }
    }
}
