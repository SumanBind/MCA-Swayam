class Solution 
{
    public int maxGoodNumber(int[] nums) 
    {
        int max = 0;
        max = Math.max(max, getValue(nums[0], nums[1], nums[2]));
        max = Math.max(max, getValue(nums[0], nums[2], nums[1]));
        max = Math.max(max, getValue(nums[1], nums[0], nums[2]));
        max = Math.max(max, getValue(nums[1], nums[2], nums[0]));
        max = Math.max(max, getValue(nums[2], nums[0], nums[1]));
        max = Math.max(max, getValue(nums[2], nums[1], nums[0]));

        return max;
    }

    private int getValue(int a, int b, int c) 
    {
        int ab = (a << bitLength(b)) + b;
        int abc = (ab << bitLength(c)) + c;
        return abc;
    }

    private int bitLength(int num) 
    {
        int length = 0;
        while (num > 0) 
        {
            length++;
            num >>= 1;
        }
        return length;
    }
}
