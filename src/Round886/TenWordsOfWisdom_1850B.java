package Round886;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TenWordsOfWisdom_1850B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            Response[] responses = new Response[n];

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                responses[i] = new Response(a, b, i + 1);
            }

            Arrays.sort(responses, Comparator.comparing(response -> response.a));

            int maxResponse = responses[0].a;
            int maxQuality = responses[0].b;
            int res = responses[0].index;
            for (int i = 0; i < n; i++) {
                if (responses[i].a <= 10 && responses[i].a >= maxResponse && responses[i].b >= maxQuality) {
                    maxResponse = responses[i].a;
                    maxQuality = responses[i].b;
                    res = responses[i].index;
                }
            }
            System.out.println(res);
        }
    }
}

class Response {

    int a;
    int b;
    int index;

    public Response(int a, int b, int index) {
        this.a = a;
        this.b = b;
        this.index = index;
    }
}
