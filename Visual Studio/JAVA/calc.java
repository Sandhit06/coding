import java.util.*;
public class calc {
     void mean(int arr[],int n)
    {
        int i;
        double s=0.0;
        for(i=0;i<n;i++)
        {
            s=s+arr[i];
        }
        s=s/n;
        System.out.println(s);
    }
    void dev(int arr[],int n)
    {
        int i;
        double s=0.0,p=0.0;
        for(i=0;i<n;i++)
        {
            s=s+arr[i];
        }
        s=s/n;
        for(i=0;i<n;i++)
        {
            p+= Math.sqrt((Math.pow((arr[i]-s),2)));
        }
        p/=n;
        System.out.println(p);
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        n = in.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]= in.nextInt();
        }
        calc ob=new calc();
        ob.mean(arr,n);
        ob.dev(arr,n);
    }
}