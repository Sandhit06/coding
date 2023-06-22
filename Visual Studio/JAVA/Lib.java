import java.util.*;
class Lib
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int b=0 , l=0, d=0 ;
        b = in.nextInt();
        l = in.nextInt();
        d = in.nextInt();
        int score[] = new int[b];
        for (int i=0;i<b;i++)
            score[i]=in.nextInt();
        int nB[]=new int[l];
        int SignUp[]=new int[];
        int ship = new int[l];
        int books[][]=new int[l][100000];
        for(int i=0;i<l;i++)
        {
            nB[i]= in.nextInt();
            SignUp[i]= in.nextInt();
            ship[i]=in.nextInt();
            for(int j=0;j<nB[i];j++)
              books[i][j]=in.nextInt();
        }
        boolean scanned[]=new boolean[b];
        int time[]=new int[l];
        for(int i=0;i<b;i++)
        scanned[i]= true;
        for(int i=0;i<l;i++)

    }
}