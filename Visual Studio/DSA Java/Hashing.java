/*import java.util.HashSet;
class Hashing
{  
    public static void main(String args[])   
    {
        HashSet<Integer> set = new HashSet<>();
        //Creating
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(3);
        System.out.println(set);
        System.out.println(set.size());
        //Search
        if(set.contains(1))
        {
            System.out.println("Contains 1");
        }
        else
        {
            System.out.println("Does not contain 1");
        }
        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Does not contain 1");
        }
    }
}*/
import java.util.*;
import java.util.HashMap;
class Hashing
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i;
        int t=6;
        int nums[]={3,2,4};
        HashMap<Integer,Integer> map= new HashMap<>();
        int res[]=new int[2];
        for(i=0;i<nums.length;i++) {
        if(map.containsKey(nums[i]))
        {
            res[0]=i;
            res[1]= map.get(nums[i]);
            System.out.println(res[0]);
            System.out.println(res[1]);
        }
        else
        {
            map.put(t-nums[i],i);
        }    
    }
    //System.out.println("Values"+ map.values());
    }
}