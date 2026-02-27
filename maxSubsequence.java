class Solution 
{
    public int[] maxSubsequence(int[] nums, int k) 
    {
        int n = nums.length;
        
        int[] copy = nums.clone();
        Arrays.sort(copy);
        
        int[] largest = new int[k];
        int index = 0;
        
        for(int i = n - k; i < n; i++) 
        {
            largest[index++] = copy[i];
        }
        
        int[] result = new int[k];
        int resIndex = 0;
        
        for(int i = 0; i < n; i++) 
        {
            for(int j = 0; j < k; j++) 
            {
                if(nums[i] == largest[j]) 
                {
                    result[resIndex++] = nums[i];
                    largest[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        
        return result;
    }
}
