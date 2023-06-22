import java.util.*;
public class Exception {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=5,b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Rest Of The Code");
    }
}