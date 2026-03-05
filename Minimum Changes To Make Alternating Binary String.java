/* You are given a string s consisting only of the characters '0' and '1'. In one operation, you can change any '0' to '1' or vice versa.

The string is called alternating if no two adjacent characters are equal. For example, the string "010" is alternating, while the string "0100" is not.

Return the minimum number of operations needed to make s alternating.

 

Example 1:

Input: s = "0100"
Output: 1
Explanation: If you change the last character to '1', s will be "0101", which is alternating.
Example 2:

Input: s = "10"
Output: 0
Explanation: s is already alternating.
Example 3:

Input: s = "1111"
Output: 2
Explanation: You need two operations to reach "0101" or "1010".
  */

import java.util.*;
public class Alternating 
{

	public int minOperations(String s) 
    {
		 int count0 = 0; 
	        int n = s.length();
	        
	        for(int i = 0; i < n; i++) 
	        {
	            char expected = (i % 2 == 0) ? '0' : '1';
	            if(s.charAt(i) != expected) 
	            {
	                count0++;
	            }
	        }
	        
	        int count1 = n - count0;
	        
	        return Math.min(count0, count1);
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Alternating ob=new Alternating();
		System.out.println("Enter a String:");
		String s=sc.next();
		int result= ob.minOperations(s);
		System.out.println(result);
	}

}
