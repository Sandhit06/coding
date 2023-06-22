import java.util.*;
public class max {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,max=0,min=0;
        n = in.nextInt();
        int arr[]=new int[n];        
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        max = arr[0];
        min = arr[0];
        for(int i=0;i<n;i++)
        {
            if(max>arr[i])
            max = arr[i];
            if(min<arr[i])
            min = arr[i];
        }
        System.out.println("Max element is: " + max);
        System.out.println("Min element is: " +min);
    }
}
