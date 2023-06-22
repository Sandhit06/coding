import java.util.*;
public class TollPlaza {
     int tollRate(char c)
    {
        int toll;
         if(c=='C')
        {
            toll=50;
        }
        else if(c=='V')
        {
            toll=75;
        }
        else 
        {
            toll=100;
        }
        return toll;
    }
     int tollRate(int toll,char B)
    {
        toll=0;
        return toll;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int pr,n1,pr1;
        char ch,d;
        ch = in.next().charAt(0);
        pr = in.nextInt();
        if(ch=='C' || ch=='B' || ch=='V' )
        {
            System.out.println("Enter whether govt vehicle or not ");
            d= in.next().charAt(0);
            System.out.println(d);
            System.out.println(ch);
            System.out.println(pr);
            pr= tollRate(ch);
            if(d=='Y')
            {
               pr1= tollRate(pr,d);
               System.out.println(pr1); 
            }
            else
            {
                System.out.println(pr);
            }
        }
        
        else if(pr<0)
        {
            System.out.println("Invalid Price");
        }
        else
        {
            System.out.println("Invalid vehicle type");
        }
   }
}
