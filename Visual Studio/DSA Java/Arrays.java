import java.util.Arrays;
import java.util.*;
public class Arrays {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n;
        System.out.println("Enter n");
        n = in.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            arr[i]= in.nextInt();
        }
        //print(arr);
        System.out.println(Arrays.toString(arr));
    }   
}