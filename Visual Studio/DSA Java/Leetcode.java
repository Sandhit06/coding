import java.util.*;
public class Leetcode {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i,t,n1,n2;
        System.out.println("Enter n");
        n = in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the values");
        for( i=0;i<n;i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter target");
        t = in.nextInt();
        for(i=0;i<n-1;i++)
        {
            if(arr[i]+arr[i+1]==t)
            {
                n1 = i;
                n2 = i+1;
                System.out.println(n1+","+n2);
            }
        }
    }
}
