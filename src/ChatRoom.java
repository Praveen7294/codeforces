import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        String s,rs="";
        int h=1,e=1,l1=1,l2=1,o=1;

        Scanner sc = new Scanner(System.in);
        s = sc.next();
        s = s.toLowerCase();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='h') {
                while (h-- > 0) {
                    rs = rs + 'h';
                }
                if(rs.charAt(0)=='h'){
                    for(int j=i+1;j<s.length();j++){
                        if(s.charAt(j)=='e'){
                            while (e-->0){
                                rs = rs + 'e';
                            }
                            if(rs.charAt(1)=='e'){
                                for(int k=j+1;k<s.length();k++){
                                    if(s.charAt(k)=='l'){
                                        while (l1-->0){
                                            rs = rs + 'l';
                                        }
                                        if(rs.charAt(2)=='l'){
                                            for(int l=k+1;l<s.length();l++){
                                                if(s.charAt(l)=='l') {
                                                    while (l2-- > 0) {
                                                        rs = rs + 'l';
                                                    }
                                                    if(rs.charAt(3)=='l'){
                                                        for(int m=l+1;m<s.length();m++){
                                                            if(s.charAt(m)=='o') {
                                                                while (o-- > 0) {
                                                                    rs = rs + 'o';
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if(rs.equals("hello")){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
