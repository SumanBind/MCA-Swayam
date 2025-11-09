package collage;

import java.util.Scanner;

class Solution2 
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		Solution2 ob=new Solution2();
		int nums[]=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		long p=ob.subArrayRanges(nums);
		System.out.println(p);
	}

    public long subArrayRanges(int[] nums) 
    {
        int n = nums.length;
        long ans = 0;
        for(int i=0; i<n; i++)
        {
            int max = nums[i];
            int min = nums[i];
            for(int j=i; j<n; j++)
            {
                max = Math.max(nums[j],max);
                min = Math.min(nums[j],min);
                ans += max-min;
            }
        }
        return ans;
    }
}
