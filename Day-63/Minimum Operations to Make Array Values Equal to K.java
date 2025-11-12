

public class Solution 
{
    public int minOperations(int[] nums, int k) 
    {
        int n = nums.length;

        for (int num : nums) 
        {
            if (num < k) 
            return -1;
        }

        Arrays.sort(nums);

        int operations = 0;
        int lastVal = -1; 

        for (int i = n - 1; i >= 0; ) 
        {
            int current = nums[i];
            if (current == k)
             break;

            int j = i;
            while (j >= 0 && nums[j] == current) 
            j--;

           
            if (lastVal != -1 && !(lastVal > current)) 
            {
              
                return -1;
            }

            operations++;
            lastVal = current;
            i = j;
        }

    
        if (operations == 0) 
        return 0;

        return operations;
    }

   
}
