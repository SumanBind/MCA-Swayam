/* ou are given an integer n.

Define its mirror distance as: abs(n - reverse(n))​​​​​​​ where reverse(n) is the integer formed by reversing the digits of n.

Return an integer denoting the mirror distance of n​​​​​​​.

abs(x) denotes the absolute value of x.

 

Example 1:

Input: n = 25

Output: 27

Explanation:

reverse(25) = 52.
Thus, the answer is abs(25 - 52) = 27.
Example 2:

Input: n = 10

Output: 9

Explanation:

reverse(10) = 01 which is 1.
Thus, the answer is abs(10 - 1) = 9.
Example 3:

Input: n = 7

Output: 0

Explanation:

reverse(7) = 7.
Thus, the answer is abs(7 - 7) = 0.
*/

import java.util.*;
public class Mirror 
{
	public int mirrorDistance(int n) 
	{
		int c=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
        return Math.abs(c-sum);
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		Mirror ob=new Mirror();
		int result=ob.mirrorDistance(n);
		System.out.println("Result: "+ result);
	}
}
