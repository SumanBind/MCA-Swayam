/*
Given the binary representation of an integer as a string s, return the number of steps to reduce it to 1 under the following rules:

If the current number is even, you have to divide it by 2.

If the current number is odd, you have to add 1 toit.

It is guaranteed that you can always reach one for all test cases.

 

Example 1:

Input: s = "1101"
Output: 6
Explanation: "1101" corressponds to number 13 in their decimal representation.
Step 1) 13 is odd, add 1 and obtain 14. 
Step 2) 14 is even, divide by 2 and obtain 7.
Step 3) 7 is odd, add 1 and obtain 8.
Step 4) 8 is even, divide by 2 and obtain 4.  
Step 5) 4 is even, divide by 2 and obtain 2. 
Step 6) 2 is even, divide by 2 and obtain 1.  
Example 2:

Input: s = "10"
Output: 1
Explanation: "10" corresponds to number 2 in their decimal representation.
Step 1) 2 is even, divide by 2 and obtain 1.  
Example 3:

Input: s = "1"
Output: 0
*/


import java.util.*;
public class Solution 
{
	public int BinaryToDecimal(String s)
	{
		 int n=s.length();
	        int p=n-1;
	        int result=1;
	        int sum=0;
	        for(int i=0;i<n;i++)
	        {
	        	int a=s.charAt(i) - '0';
	        	result=1;
	        	for(int j=1;j<=p;j++)
	        	{
	        		result=result*2;
	        	}
	        	sum=sum+result*a;
	        	p--;
	        }
	        return sum;
	}
	public int numSteps(String s) 
    {
	   int count=0;
       int n=BinaryToDecimal(s);
       while(n>1)
       {
    	   if(n%2!=0)
    	   {
    		   n++;
    	   }
    	   else
    	   {
    		   n=n/2;
    	   }
    	   count++;
       }
       return count;
    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String s=sc.next();
		Solution ob= new Solution();
		int result=ob.numSteps(s);
		System.out.println(result);

	}

}
