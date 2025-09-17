
import java.util.*;
class ApplyOperationstoanArray2460 
{
    public int[] applyOperations(int[] nums) 
    {
        int n=nums.length;
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1])
            {
                nums[i-1]=nums[i-1]*2;
                nums[i]=0;
            }
        }
        int index = 0;
        for (int i = 0; i < n; i++) 
        {
            if (nums[i] != 0) 
            {
                nums[index++] = nums[i];
            }
        }
        while (index < n) 
        {
            nums[index++] = 0;
        }
       
        return nums;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("Enter array size ");
        int[]aa=new int[n];
        System.out.print("Enter array element ");
        for(int i=0;i<n;i++)
        {
            aa[i]=sc.nextInt();
        }
        ApplyOperationstoanArray2460 ob=new ApplyOperationstoanArray2460();
        int[]result=ob.applyOperations(aa);
        System.out.print("Display array ofter operation ");
        for(int i=0;i<n;i++)
        {
            System.out.print(result[i]+" ");
        }
    }
}