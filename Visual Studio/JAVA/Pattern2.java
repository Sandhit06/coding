public class Pattern2 {
    public static void main(String args[]) {
        int n=4;
        double a=0.0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        a= Math.pow(2,3);
        System.out.println(a);
    }
    
}
