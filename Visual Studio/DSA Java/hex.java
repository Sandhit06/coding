import java.util.*;
import java.lang.*;
public class hex {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,b,n,n1,n2=0,s=0,s1=0;
        char ch;
        String st;
        st = in.next();
        b = st.length();
        int c=0;
        for(i=b-1;i>=0;i--)
        {
            ch = st.charAt(i);
            Boolean flag = Character.isDigit(st.charAt(i));
            if (flag)
            {
                n1 =  ch-'0';
                n2 += n1*(int)Math.pow(16,c);
                c++;
            }
            else
            {
                if(ch=='A')
                {
                    n =10*(int)Math.pow(16,c);
                    c++;
                }
                else if(ch=='B')
                {
                    n = 11*(int)Math.pow(16,c);
                    c++;
                }
                else if(ch=='C')
                {
                    n =12*(int)Math.pow(16,c);
                    c++;
                }
                else if(ch=='D')
                {
                    n = 13*(int)Math.pow(16,c);
                    c++;
                }
                else if(ch=='E')
                {
                    n = 14*(int)Math.pow(16,c);
                    c++;
                }
                else
                {
                    n = 15*(int)Math.pow(16,c);
                    c++;
                }
                
                s = s+n;
                n=0;
                
            }
        }
        s1=s+n2;
        System.out.println(s1);
    }
}

