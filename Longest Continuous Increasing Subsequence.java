/*
Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray). The subsequence must be strictly increasing.

A continuous increasing subsequence is defined by two indices l and r (l < r) such that it is [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].

 

Example 1:

Input: nums = [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
4.
Example 2:

Input: nums = [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2] with length 1. Note that it must be strictly
increasing.
 */

import java.util.*;
public class Longe 
{
	public int findLengthOfLCIS(int[] nums) 
	{
        if (nums.length == 0) return 0;

        int maxLen = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) 
        {
            if (nums[i] > nums[i - 1]) 
            {
                count++;  
            }
            else 
            {
                count = 1; 
            }
            maxLen = Math.max(maxLen, count);
        }

        return maxLen;
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Longe ob=new Longe();
		int result=ob.findLengthOfLCIS(a);
		System.out.println(result);
	}

}
