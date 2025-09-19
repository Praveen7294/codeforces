import java.util.Scanner;

public class Taxi_158B {
    public static void main(String[] args) {
        int count1=0,count2=0,count3=0,count4=0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nocg = new int[n];

        for(int i=0;i<n;i++)
            nocg[i] = sc.nextInt();

        for(int i=0;i<n;i++){
            if(nocg[i]==1)
                count1++;
            else if(nocg[i]==2)
                count2++;
            else if(nocg[i]==3)
                count3++;
            else if(nocg[i]==4)
                count4++;
        }

        if(count1<=count3) {
            count4 += count1;
            count3 -= count1;
            count1 -= count1;
        } else {
            count4 += count3;
            count1 -= count3;
            count3 -= count3;
        }

        count4 += count2/2;
        count2 = count2%2;
        count4 += count3;
        if(count2!=0 && count1>=2){
            count4++;
            count1 -= 2;
            count2 -= 1;
        }
        if((count1+count2)%4==0)
            System.out.println(count4+(count1+count2)/4);
        else
            System.out.println(count4+(count1+count2)/4+1);
    }
}
