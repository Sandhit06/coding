import java.util.*;
class camelia {
   static void myPass()
    {
        Scanner in=new Scanner(System.in);
        int n,n1, d=0 , b, i;
        String s="";
        boolean b1=true;
        do{  
            System.out.println("Input a password");     
             s = in.next();
             b = s.length();

             for(i = 0 ; i<b ; i++ ) // checking for digits
             {
                 if(s.charAt(i) >= '0' && s.charAt(i)<='9')
                 d++;
             }
            for(i=0 ; i<b ; i++) // checking for letters and digits
            {
               b1 = Character.isLetterOrDigit(s.charAt(i));
            }

            if(b>=10 &&d>2 && b1==true) // main condition
             {
               n1 = 1 ;
               System.out.println("Password is valid");
             }
            else
             {
               n1 = -1;    
               System.out.println("Invalid input try again");
             }           
        } 
        while(n1!=1);

    }
    public static void main(String[] args) {
        myPass();
    }
}