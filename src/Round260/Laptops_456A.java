package Round260;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Laptops_456A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Laptops[] laptops = new Laptops[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            laptops[i] = new Laptops(a, b);
        }

        Arrays.sort(laptops, Comparator.comparing(laptops2 -> laptops2.price));

        int count = 0;
        for (int i = 0; i < n-1; i++) {
            if (laptops[i].quality > laptops[i + 1].quality && laptops[i].price != laptops[i + 1].price) {
                count++;
            }
        }

        if(count >= 1) {
            System.out.println("Happy Alex");
        }
        else {
            System.out.println("Poor Alex");
        }
    }
}

class Laptops {
    int price;
    int quality;

    Laptops(int price, int quality) {
        this.price = price;
        this.quality = quality;
    }
}
