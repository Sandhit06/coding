/*import java.util.*;
public class hash {
    public static void main(String args[])
    {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"One");
        map.put(2,"Two");
        map.put(3,"Three");
        map.put(1,"Three");
        System.out.println("Value of map is "+map.size());
        System.out.println(map);
        if(map.containsKey(2))
        {
            String a = map.get(2);
            System.out.println("Value of 2 is :"+ a);
        }
    }
}*/
import java.util.*;
import java.lang.*;
import java.io.*;
class hash
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int n = s.nextInt();
		    int a[] = new int[n];
		    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		    int max = 0;
		    for(int i = 0; i < n; i++){
		        a[i] = s.nextInt();
		        int x = a[i] / 2;
		        map.put(x, map.getOrDefault(x, 0) + 1);
		        max = Math.max(max, map.get(x));
                System.out.println("The max value is :"+max);
		    }	    
		    System.out.println(n - max);
		}
	}
}
