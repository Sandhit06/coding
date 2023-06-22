import java.util.*;
public class Search {
    public static void main(String args[])
    {
         Scanner in=new Scanner(System.in);
         int i,j,min,t;
         int m[]=new int[10];
         for(i=0;i<10;i++)
         {
            m[i]= in.nextInt();
         }
         for(i=0;i<9;i++)
         {
            min =i;
            for(j=i+1;j<10;j++)
            {
                if(m[j]<m[min])
                min =j;
            }
            t= m[i];
            m[i]= m[min];
            m[min]=t;
         }
         System.out.println("Ascending Order is :");
         for(i=0;i<10;i++)
         System.out.print(m[i]+ " ");
    }
}