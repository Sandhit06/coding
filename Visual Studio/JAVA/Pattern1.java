/*public class Pattern1 {
    public static void main(String args[])
    {
        int n=4,m=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1 || j==1 || i==n || j==m)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
import java.util.*;
class pattern
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=0,i,s=0;
        n = in.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]= in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            s=s+arr[i];
        }
        System.out.println(s);
    }
}
class pattern
{
    int id;
    String name;
}
class Pattern1
{
    public static void main(String args[])
    {
        pattern s=new pattern();
        System.out.println(s.id);
        System.out.println(s.name);
    }
}*/
class Pattern1
{
    public static void main(String args[])
    {
        int a,b,p=0;
        for(a=1;a<=5;a++)
        {
            for(b=1;b<=a;b++)
            {
                p=p+1;
                System.out.print(p+ " ");
            }
            System.out.println();
        }
    }
}