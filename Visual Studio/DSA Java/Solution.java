import java.util.*;
class Solution {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int i,b,b1;
        char ch,ch1;
        String s,s1,st4="";
        s = in.nextLine();
        //boolean f=false;
        s1= s.replaceAll("[^a-zA-z0-9]","").toLowerCase();
        b = s1.length();
        for(i=0;i<b;i++)
        {
            ch1= s1.charAt(i);
            st4=ch1+st4;
        }
        System.out.println(st4);
    }
}