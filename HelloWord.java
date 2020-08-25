package myTest;

import java.util.Scanner;

public class HelloWorld {
    public String str="ababab";
    public static void main(String[] args){
//        Integer x= new Integer(123);
//        Integer y= new Integer(123);
//        boolean res=x==y;
//        System.out.println(res);

        int x=2;
        System.out.println(x);
        String str="abababababb";
        boolean res=repeatedSubstringPattern(str);
        System.out.println(res);
//        Scanner sc = new Scanner(System.in);
//        int s =sc.nextInt();
//        System.out.println(s);
//        for(int i=0;i<s;i++){
//            int t = sc.nextInt();
//            System.out.println(t);
//        }
    }
    public static boolean repeatedSubstringPattern(String s) {
        int l=s.length();
        for(int i=1;i<l/2 + 1;i++){
            boolean res=true;
            if(l%i !=0) continue;
            for(int j=i;j<l;j++){
                if(s.charAt(j)!=s.charAt(j-i)){
                    res=false;
                    break;
                }
            }
            if(res) return true;
        }
        return false;
    }
}
