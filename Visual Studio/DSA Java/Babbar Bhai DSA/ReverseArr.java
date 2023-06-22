import java.util.*;
class ReverseArr
{
    static void reverse(int arr[],int start,int end)
    {
        int t;
        while(start<end)
        {
            t = arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            start ++;
            end --;
        }
    }
    static void print(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,b;
        System.out.println("Enter n");
        n = in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array Elements");
        for(i=0;i<n;i++)    
        {
            arr[i] = in.nextInt();
        }
        System.out.println("The Reversed Array Is :");
        b = arr.length;
        reverse(arr,0,b-1);
        print(arr,n);
    }
}