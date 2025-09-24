import java.util.*;

public class Main 
{
    public static int longestAPWithOneChange(int[] nums) 
    {
        int n = nums.length;
        if (n <= 2) return n;

        int ans = 2;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) 
            {
            
                double d = (double)(nums[j] - nums[i]) / (j - i);

                int count = 0, usedChange = 0;
                for (int k = 0; k < n; k++) 
                {
                    double expected = nums[i] + (k - i) * d;
                    if (Math.abs(nums[k] - expected) < 1e-6) 
                    {
                        count++;
                    } 
                    else 
                    {
                        if (usedChange == 0) 
                        {
                            usedChange = 1; 
                            count++;
                        }
                    }
                }
                ans = Math.max(ans, count);
            }
        }

        return ans;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) nums[i] = sc.nextInt();
        System.out.println(longestAPWithOneChange(nums));
    }
}
