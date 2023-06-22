import java.util.*;
public class vish
{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int p;
		p = Integer.parseInt(inp.next()); //testcases
		for(int q=0;q<p;q++){ //p=1
		Integer n=Integer.parseInt(inp.next()); //
		Integer arr[] = new Integer[n];  //{100,100,100}
		for(int i=0;i<n;i++){
		    arr[i] = Integer.parseInt(inp.next());
		}
		int k=0,m=0,b=0;
		for(int j=0;j<n;j++)
        {
		    for(int i=0;i<n;i++)
            {
            if((arr[j]>arr[i])||(arr[j]==arr[i]))
            { //100==100
                k++;
            }
            if(arr[j]<arr[i])
            {
                m++;
            }
		    }
		//System.out.println(k+" and "+m+" ");
		    if(k>m)
            {
              b++;
            }
			System.out.println(b);
        k=0;
		m=0;
		}		
		//System.out.println(b);
		}		
	}
}