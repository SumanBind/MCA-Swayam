import java.util.*;
class Solution2
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Enter number of element: ");
        int n=sc.nextInt();
      
        System.out.println("Enter array elements: ");
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
      
        System.out.println("Enter K values: ");
        int k=sc.nextInt();
      
        System.out.println("Enter values of X: ");
        int x=sc.nextInt();
      
        Solution2 ob=new Solution2();
         int[] ans = ob.findXSum(nums, k, x);

        System.out.println("Result: " + Arrays.toString(ans));
    }
    public int[] findXSum(int[] nums, int k, int x) 
    {
      int n = nums.length;
        int[] result = new int[n - k + 1];
        for (int i = 0; i < (n - k + 1); i++)
        {
            result[i] = xSum(Arrays.copyOfRange(nums, i, k+i), x);
        }
        return result;
    }
    private int xSum(int[] arr, int x) 
    {
        int[] freq = new int[51];
        for (int i = 0; i < arr.length; i++) 
        {
            freq[arr[i]]++;
        }

        int sum = 0;
        
        for (int i = 0; i < x; i++) 
        {
            
            int maxOccured = 0;
            int maxOccuredIdx = 0;
            
            for (int j = 50; j > 0; j--) 
            {
                if (freq[j] > maxOccured) 
                {
                    maxOccured = freq[j];
                    maxOccuredIdx = j;
                }
            }
            freq[maxOccuredIdx] = 0;
            
            sum += maxOccured * maxOccuredIdx;
        }
        
        return sum;
    }
}
