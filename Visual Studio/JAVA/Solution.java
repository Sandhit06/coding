import java.util.*;

import javax.lang.model.util.ElementScanner14;
class Solution {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        int i,b;
        char ch1;
        String st4="";
        String s= in.nextLine();
        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        b = s1.length();
        for(i=0;i<b;i++)
        {
            ch1= s1.charAt(i);
            st4= ch1+st4;
        }
        //System.out.println(st4);
        if(s1.equals(st4))
        System.out.println("True");
        else
        System.out.println("False");
    }
}
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        String s=in.nextLine();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) 
        {
            char curr = s.charAt(i);
            if (map.keySet().contains(curr)) 
            {
                stack.push(curr);
            }
            else if (map.values().contains(curr)) 
            {
                if (!stack.empty() && map.get(stack.peek()) == curr) 
                {
                    stack.pop();
                }
                else 
                {
                    System.out.println("false");
                }
            }
        }
        System.out.println("true");
    }
}
        int count = 0;
        int val=2;
        int nums[]=new int[8];
        for(int i=0;i<8;i++)
        {
            nums[i]= in.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        System.out.println(nums[0]);
        System.out.println(count);
    }
}*/
   HashMap<Integer,Integer> map=new HashMap<>();
        int i,j,b,p=0;
        int n=0;
        int target = in.nextInt();
        int nums[]=new int[4];
        for(i=0;i<nums.length;i++)
        {
            nums[i]= in.nextInt();
        }
        b = nums.length;
        for(i=0;i<b;i++)
        {
            map.put(nums[i],i);
        }
        for(i=0;i<b-1;i++)
            {
                if(nums[i+1]>target && nums[i]<target) 
                {               
                    p=i;
                    p=p+1; 
                    //System.out.println(p);
                }
                   
            }
        if(map.containsKey(target))
        {
            n = map.get(target); 
        }
        else
        {
                p = b-1;  
        }
        System.out.println(p);
    }
}
        