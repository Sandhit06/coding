import java.util.*;
public class sandip2 {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
        String s="";
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        n4 = in.nextInt();
        n5 = in.nextInt();
        n6 = in.nextInt();
        n7 = in.nextInt();
        n8 = in.nextInt();
        n9 = in.nextInt();
        n10 = (n1*1+n2*2+n3*3+n4*4+n5*5+n6*6+n7*7+n8*8+n9*9)%11;
        if(n10==10)
        {
            s= ""+n1+n2+n3+n4+n5+n6+n7+n8+n9;
            System.out.println(s);
        }
        else
        {
            System.out.println("Can't generate ISBN");
        }
    }
}
