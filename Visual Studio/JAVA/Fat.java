import java.util.*;
public class Fat {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int i,j,sum=0,p=1,s1=0,a,d=0;
        int arr[]=new int[5];
        a = arr.length;
        for(i=0;i<5;i++)
        {
            arr[i]= in.nextInt();
        }
        for(i=0;i<5;i++)
        {
            for(j=i+1;j<a;j++) 
            {
                if (arr[i] == arr[j]) 
                {
                    System.out.println("Duplll...");
                    d=d+1;
                    sum = arr[j] + arr[j];
                    sum = sum * 3;
                    System.out.println(sum);
                    break;
                }
            }
        } 
        if (d != 1) 
        {            
           System.out.println("All Unique");
           for(i=0;i<5;i++)
            {
               p *=arr[i] ;
               s1= p*2;                
            } 
          System.out.println(s1); 
        }                 
    }
}