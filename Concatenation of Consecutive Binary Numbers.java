/*
Given an integer n, return the decimal value of the binary string formed by concatenating the binary representations of 1 to n in order, modulo 109 + 7.

 

Example 1:

Input: n = 1
Output: 1
Explanation: "1" in binary corresponds to the decimal value 1. 
Example 2:

Input: n = 3
Output: 27
Explanation: In binary, 1, 2, and 3 corresponds to "1", "10", and "11".
After concatenating them, we have "11011", which corresponds to the decimal value 27.
Example 3:

Input: n = 12
Output: 505379714
Explanation: The concatenation results in "1101110010111011110001001101010111100".
The decimal value of that is 118505380540.
After modulo 109 + 7, the result is 505379714.
 */

import java.util.*;

public class ConsecutiveBinaryNumbers 
{
	String Binary(int n)
	{
		String s="";
		
		for(int i=1;i<=n;i++)
		{
			int temp=i;   
			
			String bin="";  
			
			while(temp>0)
			{
				int r=temp%2;
				bin=r+bin;   
				temp=temp/2;
			}
			
			s=s+bin;   
		}
		return s;
	}
	
	public int concatenatedBinary(int n) 
    {
        String s = Binary(n);
        
        long result = 0;   
        long MOD = 1000000007;
        
        for(int i=0; i<s.length(); i++)
        {
            result = (result * 2 + (s.charAt(i) - '0')) % MOD;
        }
        
        return (int)result;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter integer number:");
		int n=sc.nextInt();
		ConsecutiveBinaryNumbers ob=new ConsecutiveBinaryNumbers();
		int s1=ob.concatenatedBinary(n);
		System.out.println(s1);
	}

}


/* other solution */

class Solution 
{
    public int concatenatedBinary(int n) 
    {
        long result = 0;
        long MOD = 1000000007;
        int bitLength = 0;
        
        for(int i = 1; i <= n; i++)
        {
            if((i & (i - 1)) == 0)
            {
                bitLength++;
            }
            
            result = ((result << bitLength) + i) % MOD;
        }
        
        return (int)result;
    }
}
