import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        int i,j,m,n,count=0;//temp;
        int[][] arr = new int[5][5];
        Scanner sc = new Scanner(System.in);
        for(i=0;i<5;i++) {
            for(j=0;j<5;j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<5;i++) {
            for(j=0;j<5;j++) {
                if(arr[i][j] == 1) {
                    m=i;
                    n=j;
                    while (m != 2 || n != 2) {
                        if (m < 2 || n < 2) {
                            if (m < 2) {
//                                temp = arr[m+1][n];
//                                arr[m+1][n] = arr[m][n];
//                                arr[m][n] = temp;
                                m++;
                                count++;
                            } else {
//                                temp = arr[m][n+1];
//                                arr[m][n+1] = arr[m][n];
//                                arr[m][n] = temp;
                                n++;
                                count++;
                            }
                        } else {
                            if (m > 2) {
//                                temp = arr[m-1][n];
//                                arr[m - 1][n] = arr[m][n];
//                                arr[m][n] = temp;
                                m--;
                                count++;
                            } else {
//                                temp = arr[m][n-1];
//                                arr[m][n-1] = arr[m][n];
//                                arr[m][n] = temp;
                                n--;
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);

//        for(i=0;i<5;i++) {
//            for(j=0;j<5;j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
