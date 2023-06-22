import java.util.*;
class Employee
{
    int x,y;
}
class Programmer extends Employee
{
    Programmer(int a,int b)
    {
        x = a;
        y = b;
        System.out.println(x+"\n"+y);
    }
}
public class Inh {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int r = in.nextInt();
        int s = in.nextInt();
        new Programmer(r,s);
    }
    
}
