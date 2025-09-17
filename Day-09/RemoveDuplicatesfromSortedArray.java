import java.util.*;

class RemoveDuplicatesfromSortedArray 
{
    int removeDuplicates(int[] nums) 
    {
        if (nums.length == 0) 
            return 0;

        int k = 1;

        for (int i = 1; i < nums.length; i++) 
        {
            if (nums[i] != nums[i - 1]) 
            {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] aa = new int[n];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            aa[i] = sc.nextInt();
        }

        RemoveDuplicatesfromSortedArray ob = new RemoveDuplicatesfromSortedArray();
        int k = ob.removeDuplicates(aa);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(aa[i] + " ");
        }
    }
}
