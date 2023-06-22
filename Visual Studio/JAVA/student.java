/*import java.util.*;
class student
{
    //Scanner sc=new Scanner(System.in);
    int sum;
    float avg;
    String name;
    void setdata()
    {
        Scanner sc=new Scanner(System.in);
        //int sum;
        name=sc.nextLine();
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int a4=sc.nextInt();
        int a5=sc.nextInt();
        sum=a1+a2+a3+a4+a5;
        avg=(float)sum/5;
    }
    void getdata()
    {
        System.out.println(name+" Total: "+sum);
        System.out.println("Average: "+avg);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        student st1=new student();
        student st2=new student();
        int n=s.nextInt();
        st1.setdata();
        st2.setdata();
        st1.getdata();
        st2.getdata();
    }
}*/
import java.util.*;
class student
{
    int roll;
    String name ;
    float fee;
    student(int roll,String name,float fee)
    {
        this.roll=roll;
        this.name=name;
        this.fee=fee;
    }
    void display()
    {
        System.out.println(roll+" "+name +" "+fee);
    }
}
class TestThis1
{
    public static void main(String args[])
    {
        student s1=new student(111,"ankit",500f);
        student s2=new student(112,"sumit",600f);
        s1.display();
        s2.display();
    }
}