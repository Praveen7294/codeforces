package Round1046;

import java.util.Scanner;

public class InTheDream_2136A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (a > b) {
                int quo = a / 2;
                if (a % 2 == 0) {
                    quo--;
                }
                if (quo <= b) {
                    c -= a;
                    d -= b;
                    if (c == d) {
                        System.out.println("YES");
                    } else if (c > d) {
                        int quoSec = c / 2;
                        if (c % 2 == 0) {
                            quoSec--;
                        }
                        if (quoSec <= d) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    } else {
                        int quoSec = d / 2;
                        if (d % 2 == 0) {
                            quoSec--;
                        }
                        if (quoSec <= c) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    }
                } else {
                    System.out.println("NO");
                }
            } else if (b > a) {
                int quo = b / 2;
                if (b % 2 == 0) {
                    quo--;
                }
                if (quo <= a) {
                    c -= a;
                    d -= b;
                    if (c == d) {
                        System.out.println("YES");
                    } else if (c > d) {
                        int quoSec = c / 2;
                        if (c % 2 == 0) {
                            quoSec--;
                        }
                        if (quoSec <= d) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    } else {
                        int quoSec = d / 2;
                        if (d % 2 == 0) {
                            quoSec--;
                        }
                        if (quoSec <= c) {
                            System.out.println("YES");
                        } else {
                            System.out.println("NO");
                        }
                    }
                } else {
                    System.out.println("NO");
                }
            } else {
                c -= a;
                d -= a;
                if (c == d) {
                    System.out.println("YES");
                } else if (c > d) {
                    int quoSec = c / 2;
                    if (c % 2 == 0) {
                        quoSec--;
                    }
                    if (quoSec <= d) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                } else {
                    int quoSec = d / 2;
                    if (d % 2 == 0) {
                        quoSec--;
                    }
                    if (quoSec <= c) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            }
        }
    }
}
