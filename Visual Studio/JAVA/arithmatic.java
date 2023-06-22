import java.util.*;
class arithmatic{
     static void add(double n1,double n2){
        double a=n1+n2;
        System.out.println(a);
    }
    static void sub(double n1,double n2){
        double s=n1-n2;
        System.out.println(s);
    }
    public static void mul(double n1,double n2){
        double m=n1*n2;
        System.out.println(m);
    }
    public static void div(double n1, double n2){
        double d=n1/n2;
        System.out.println(d);
    }   
}
class operation extends arithmatic{ 
    void get
        public static void main(String[] args){ 
        Scanner in=new Scanner(System.in);
        double n1=in.nextDouble();
        double n2=in.nextDouble();      
        operation op=new operation();
        if (n1<0){
            System.out.println("First number is negative");
            op.add(n1,n2);
            op.sub(n1,n2);
            op.mul(n1,n2);
            op.div(n1,n2);
        }
        else if(n2==0)
        {
            op.add(n1,n2);
            op.sub(n1,n2);
            op.mul(n1,n2);
        }
        else if (n2<0){
            System.out.println("Second Number is Negative");
            op.add(n1,n2);
            op.sub(n1,n2);
            op.mul(n1,n2);
            op.div(n1,n2);
        }
        else if(n1<0&&n2<0){
            System.out.println("Both are Negative Numbers");
            op.add(n1,n2);
            op.sub(n1,n2);
            op.mul(n1,n2);
            op.div(n1,n2);
        }          
    }
}