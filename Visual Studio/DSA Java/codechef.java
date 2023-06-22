/*import java.util.*;
class codechef
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        n = in.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int x[]=new int[n];
        int y[]=new int[n];
        int t1[]=new int[n];
        int t2[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]= in.nextInt();
            b[i]= in.nextInt();
            x[i]= in.nextInt();
            y[i]= in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>0 && b[i]>0 && x[i]>0 && y[i]>0 && n>0 && n<2500 && a[i]<101 && b[i]<101 && x[i]<11 && y[i]<11)
            {
            t1[i]= a[i]/x[i];
            t2[i]= b[i]/y[i];
            if(t1[i]==t2[i])
            System.out.println("Both");
            else if(t1[i]>t2[i])
            System.out.println("Chefina");
            else
            System.out.println("Chef");
            }
            
        }
    }
}
import java.io.*;
import java.lang.*;
import java.util.*;
class Codechef
{
    public static void main(String args[]) throws java.lang.Exception
    {
        Scanner in=new Scanner(System.in);
        int n,i,a,b,x,y;
        double t1,t2;
        n = in.nextInt();
        for(i=0;i<n;i++)
        {
            a= in.nextInt();
            b= in.nextInt();
            x= in.nextInt();
            y= in.nextInt();
            if(a>0 && b>0 && x>0 && y>0 && n>0 && n<2500 && a<101 && b<101 && x<11 && y<11)
            {
              t1=(double) a/x;
              t2=(double) b/y;
              if(t1==t2)
                System.out.println("Both");
              else if(t1>t2)
                System.out.println("Chefina");
              else
                System.out.println("Chef");
            }
        }
    }
}
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t,i,j,n,x,p,s;
		// t- no of testcases , n no of friends , x - no of slices
		t = in.nextInt();
		for(i=0;i<t;i++)
		{
		    n = in.nextInt();
		    x = in.nextInt();
		    s = n*x;
		    for(j=1;j<=10;j++)
		    {
		        p = j*4;
		        if(p>=s)
                {
		        System.out.println(j);
                break;
		    }
		}
	}
    double a = 3.8;
    double f_a = Math.ceil(a); // floor value of 3.8 will be 3.0 
    System.out.println("Floor value of " + a + " = " + f_a);

}
}
 package codechef; // don't place package name! 

import java.util.*;
 Name of the class has to be "Main" only if the class is public. 
class codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t,i,x,y,s;
		t = in.nextInt();
		for(i=0;i<t;i++)
		{
		    x = in.nextInt();
		    y = in.nextInt();
		    s = (y/x)*100;
		    if(s>=50)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
import java.util.*;
import java.lang.*;
class codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try{		    
		    Scanner sc = new Scanner(System.in);		    
		    int t = sc.nextInt();		    
		    while(t-- > 0){
		        // I/P
		        int n = sc.nextInt();
		        int [] arr = new int[n];
		        for(int i=0;i<n;i++)
		            arr[i] = sc.nextInt();
		        HashMap<Integer,Integer> map = new HashMap<>();
		        for(int i=0;i<n;i++){
		           if(!map.containsKey(arr[i]))
		                map.put(arr[i],1);
		           else
		                map.put(arr[i],(map.get(arr[i]) + 1));
		        }		        
		        int maxf = Integer.MIN_VALUE;
		        for(int val:map.values())
		            maxf = Math.max(val,maxf);		        		        
		        System.out.println(n-maxf);
		    }
		}
        catch(Exception e)
        {
		    return;
		}		
	}
}
import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for(int k=0;k<T;k++)
		{
		    int N=sc.nextInt();
		    int[] arr=new int[11];
		    for(int i=0;i<N;i++)
		    {
		        int x=sc.nextInt();
		        arr[x]++;
		    }	
		    int max=0;
		    for(int i:arr)
		     max=Math.max(max,i);		     
		    System.out.println(N-max);
		}
	}
}
import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t,n;
		t = in.nextInt();
		for(i=0;i<t;i++)
		{
		    n = in.nextInt();
		    int arr[]=new int[n];
		    for(j=0;j<n;j++)
		    {
		        arr[j]= in.nextInt();
		    }
		    for(j=0;j<n;j++)
		    {

import java.util.*;
class Codechef
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=0,i;
		for(i=0;i<10;i++)
		{
			n = n^i;
			System.out.println(n);
		}
	}
}
import java.util.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		while (t-->0){
		    int n = sc.nextInt();
		    int arr [] = new int [n];
		    for (int i = 0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
            int max= arr[n-1], min = arr[0];
            int count = 0, countn = 0;
            for(int i=0;i<n;i++)
		    {
		        if(arr[i]==min)
		        {
		            countn++;
		        }
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]%min!=0)
		        {
		            count=1;
		            break;
		        }
		    }
		    if(count==1)
		    {
		        System.out.println(n);
		    }
		    else{
		        System.out.println(n-countn);
		    }
           
		}
	}
}
import java.util.*;
import java.util.Arrays;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		while (t-->0){
		    int n = sc.nextInt();
		    int arr [] = new int [n];
		    for (int i = 0; i<n; i++){
		        arr[i] = sc.nextInt();
		    }
		    Arrays.sort(arr);
            int max= arr[n-1], min = arr[0];
            int count = 0, countn = 0;
            for(int i=0;i<n;i++)
		    {
		        if(arr[i]==min)
		        {
		            countn++;
		        }
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(arr[i]%min!=0)
		        {
		            count=1;
		            break;
		        }
		    }
		    if(count==1)
		    {
		        System.out.println(n);
		    }
		    else{
		        System.out.println(n-countn);
		    }
           
		}
	}
}
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Arrays;
class codechef
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int tp = in.nextInt();
		while(tp-->0)
		{
			int np = in.nextInt();
			int arr[]=new int[np];
			boolean pp = false;
			int sum=0;
			for(int i=0;i<np;i++)
			{
				arr[i]= in.nextInt();
			}
			Arrays.sort(arr);
			for(int i=0;i<np;i++)
			{
				if(arr[i]>i+1)
				pp = true;
				else
				sum = sum+arr[i];
			}
			//System.out.println(sum);
			if(pp)
			System.out.println(-1);
			else
			System.out.println(np*(np+1)/2);
		}
	}
}
import java.util.*;
class Codechef
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,t, a,j ,b,c=0;
		t = in.nextInt();
		for(i=0;i<t;i++)
		{
			a = in.nextInt();
			b = in.nextInt();
			for(j=a;j<=b;j++)
			{
				if(j%1==0 && j%j==0 )
				{
					if(j)
					System.out.print(j);
				}
			}
		}
		//System.out.println(c);
	}
}*/
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
		    int n=in.nextInt();
		    int[] arr = new int[n];
		    int[] fre = new int[1001];
		    for(int i=0;i<n;i++)
		    {
		        arr[i]=in.nextInt();
		        fre[arr[i]]++;    
		    }
		    Arrays.sort(fre);
		    //System.out.println(n-fre[1000]);
		}
	}
}