import java.util.*;
public class Sem {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        String s="",s1="",s2="",pf1="",pf2="",r1="",r2="",r3="",pf3="";
        s= in.next();
        if(s.equals("ETH"))
        {
            s1= in.next();
            pf1= in.next();
            r1 = in.next();
            s2 = in.next();
            pf2= in.next();
            r2 = in.next();
            if(pf1.equals("F"))
            System.out.println("Register this Course");
            else
            System.out.println("No need to fregister");
        }
        else
        {

            pf3= in.next();
            r3 = in.next();
            if(pf3.equals("F"))
            System.out.println("Register this Course");
            else
            System.out.println("No need to register");

        }
    }
}
