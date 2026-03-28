/*
The power of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string s, return the power of s.

 

Example 1:

Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.
Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.
 */

import java.util.*;
public class Consecutive 
{
		 public int maxPower(String s) 
		 {
		        int maxPower = 1;
		        int current = 1;

		        for (int i = 1; i < s.length(); i++) 
		        {
		            if (s.charAt(i) == s.charAt(i - 1)) 
		            {
		                current++;
		            }
		            else 
		            {
		                current = 1;
		            }
		            maxPower = Math.max(maxPower, current);
		        }

		        return maxPower;
		    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String s=sc.next();
		Consecutive ob=new Consecutive();
		int result=ob.maxPower(s);
		System.out.println(result);
	}

}
