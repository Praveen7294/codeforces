package Round280;

import java.util.Scanner;

public class VanyaAndCubes_492A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 1;
        int numOfCubesInOneLevel = 1;
        while (numOfCubesInOneLevel <= n) {
            n = n - numOfCubesInOneLevel;
            i++;
            numOfCubesInOneLevel = (i * (i + 1)) / 2;
        }
        System.out.println(i-1);
    }
}
