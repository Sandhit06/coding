import java.util.*;
public class sandip {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a,b,c;
        double d,r1=0.0,r2=0.0;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = (b*b)-(4*a*c);
        r1= (-b + Math.pow(d,0.5))/2*a;
        r2= (-b - Math.pow(d,0.5))/2*a;
        //System.out.println(r1);
        if(d>0.0)
        {
            System.out.println(r1);
            System.out.println(r2);
        }
        else if(d==0.0)
        {
            System.out.println(r1);
        }
        else
        {
            System.out.println("The equation has no real roots ");
        }
    }
}
