import java.util.Scanner;

public class SpellCheck_1722A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0){
            int n = sc.nextInt();
            String s = sc.next();

            if(spellCheck(s,n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    static boolean spellCheck(String s, int n){
        if(n!=5) return false;

        char[] originalName = {'T','i','m','u','r'};
        char[] ch = s.toCharArray();

        int count = 0;
        for(int i=0;i<5;i++)
            if(contains(ch[i], originalName)) count++;

        return count == 5;
    }

    static boolean contains(char ch,char[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ch) {
                arr[i] = '0';
                return true;
            }
        }
        return false;
    }
}
