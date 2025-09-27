class Solution 
{
    public int findMiddleIndex(int[] nums) 
    {
        int frontSum = 0;
        int lastSum = 0;
        for(int i: nums) frontSum += i;
        for(int j = 0;j<nums.length;j++)
        {
            if(lastSum == frontSum-lastSum-nums[j]) return j;
            lastSum += nums[j];
        }
        return -1;
    }
}
