import java.util.*;
class lucky {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,n,j,t=0;
        n = in.nextInt();
        int a[]=new int[4];
        for(i=0;i<4;i++)
        {
            a[i]=n%10;
            n=n/10;
        }
        for(i=0;i<4;i++)
        {
            for(j=i+1;j<4;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(i=0;i<4;i++)
        {
            System.out.print(a[i]+"");
        }
    }    
}
