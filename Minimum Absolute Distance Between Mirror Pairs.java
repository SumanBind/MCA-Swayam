/*    You are given an integer array nums.

A mirror pair is a pair of indices (i, j) such that:

0 <= i < j < nums.length, and
reverse(nums[i]) == nums[j], where reverse(x) denotes the integer formed by reversing the digits of x. Leading zeros are omitted after reversing, for example reverse(120) = 21.
Return the minimum absolute distance between the indices of any mirror pair. The absolute distance between indices i and j is abs(i - j).

If no mirror pair exists, return -1.

 

Example 1:

Input: nums = [12,21,45,33,54]

Output: 1

Explanation:

The mirror pairs are:

(0, 1) since reverse(nums[0]) = reverse(12) = 21 = nums[1], giving an absolute distance abs(0 - 1) = 1.
(2, 4) since reverse(nums[2]) = reverse(45) = 54 = nums[4], giving an absolute distance abs(2 - 4) = 2.
The minimum absolute distance among all pairs is 1.

Example 2:

Input: nums = [120,21]

Output: 1

Explanation:

There is only one mirror pair (0, 1) since reverse(nums[0]) = reverse(120) = 21 = nums[1].

The minimum absolute distance is 1.

Example 3:

Input: nums = [21,120]

Output: -1

Explanation:

There are no mirror pairs in the array. 

*/


import java.util.*;
public class Absolute 
{
	public int minMirrorPairDistance(int[] nums) 
	{
	
		        int n = nums.length;
		        int min = Integer.MAX_VALUE;

		        for (int i = 0; i < n; i++) 
		        {
		            int rev = reverse(nums[i]);

		            for (int j = i + 1; j < n; j++) 
		            {   
		                if (rev == nums[j]) 
		                {
		                    min = Math.min(min, j - i);
		                }
		            }
		        }

		        return (min == Integer.MAX_VALUE) ? -1 : min;
		    }

		    public int reverse(int num) {
		        int rev = 0;
		        while (num != 0) 
		        {
		            rev = rev * 10 + num % 10;
		            num /= 10;
		        }
		        return rev;
		    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("Enter valuesof Array: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Absolute ob=new Absolute();
		int result=ob.minMirrorPairDistance(a);
		System.out.println("Result: "+ result);
	}

}
