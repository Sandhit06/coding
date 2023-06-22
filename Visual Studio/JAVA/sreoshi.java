import java.util.*;
class Sreoshi
{    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int N=0 ,i;       
        N = in.nextInt();
        String name[]=new String[N];
        double s[]=new double[N];
        double s1[]=new double[N];
        int hr[]=new int[N];
        for( i =0 ; i<N ; i++ )
        {
            name[i]=in.next();
            s[i]= in.nextDouble();
            hr[i]=in.nextInt();
        }
        for ( i=0;i<N;i++)
       { 
     if ( s[i]>15000.0 && hr[i]>=5)
     s1[i] = s[i]+0.08*s[i];
     else if( hr[i]>3 && hr[i]<5)
     s1[i] = s[i]+0.06*s[i];
     else if( s[i]<=15000 && hr[i]>3 )
     s1[i] = s[i]+1000;
     else
      s1[i] = s[i];
     }
    for(i=0;i<N;i++)
     {
    System.out.println(name[i] + "\t" + s[i] + "\t" + hr[i] + "\t" + s1[i] );
     }
  }
}