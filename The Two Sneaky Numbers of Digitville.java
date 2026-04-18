/*  In the town of Digitville, there was a list of numbers called nums containing integers from 0 to n - 1. Each number was supposed to appear exactly once in the list, however, two mischievous numbers sneaked in an additional time, making the list longer than usual.

As the town detective, your task is to find these two sneaky numbers. Return an array of size two containing the two numbers (in any order), so peace can return to Digitville.

 

Example 1:

Input: nums = [0,1,1,0]

Output: [0,1]

Explanation:

The numbers 0 and 1 each appear twice in the array.

Example 2:

Input: nums = [0,3,2,1,3,2]

Output: [2,3]

Explanation:

The numbers 2 and 3 each appear twice in the array.

Example 3:

Input: nums = [7,1,5,4,3,4,6,0,9,5,8,2]

Output: [4,5]

Explanation:

The numbers 4 and 5 each appear twice in the array.

 */

import java.util.*;
public class Digitville 
{
	public int[] getSneakyNumbers(int[] nums) 
	{
        Arrays.sort(nums);
        int result []=new int [0];
        int index=0;
        for(int i=1;i<nums.length;i++)
        {
        	if(nums[i]==nums[i-1])
        	{
        		result[index++]=nums[i];
        	}
        }
        return result;
    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int a[]=new int [n];
		System.out.println("Enter array values: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Digitville ob=new Digitville();
		int result []=ob. getSneakyNumbers(a);
		for(int x:result)
		{
			System.out.print(x+" ");
		}
	}

}
