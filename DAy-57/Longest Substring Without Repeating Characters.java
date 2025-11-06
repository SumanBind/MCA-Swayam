import jav.util.*;
class Solution 
{
  public static void main(String [] arg)
  {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a String");
    String s=sc.next();
    Solution ob=new Solution();
    int result=ob.lengthOfLongestSubstring(s);
    System.out.println(result);
  }
    public int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        int res = 0;

        for (int i = 0; i < n; i++) 
        {
            boolean[] vis = new boolean[128];  

            for (int j = i; j < n; j++) 
            {
                if (vis[s.charAt(j)]) 
                    break;
                else 
                {
                    res = Math.max(res, j - i + 1);
                    vis[s.charAt(j)] = true;
                }
            }
        }
        return res;
    }
}
