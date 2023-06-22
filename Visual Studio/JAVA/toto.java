import java.util.*;

import javax.lang.model.util.ElementScanner14;
class toto
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j,c=0; 
        int a1[]=new int[11];
        for(i=0;i<11;i++)
        {
            a1[i]=in.nextInt();
        }
        
        for(i=0;i<=6;i++)
        {
            for(j=0;j<11;j++)
            {
                if(a1[j]==i)
                c++;
            }
            if(c<2)
            {
                System.out.println(i);
                break;
            }
            else if(c>2)
            {
                System.out.println("Invalid Input");
                break;
            }
            else 
            {
                c=0;
                continue;
            }
          
    }
  }
}