import java.util.*;

class Solution
 {
    public void findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n=nums1.length;
        int n1=nums2.length;
        int arr[]=new int[n+n1];
        for(int i=0;i<n;i++)
        {
            arr[i]=nums1[i];
        }
        for(int j=0;j<n1;j++)
        {
            arr[j+n]=nums2[j];
        }
        Arrays.sort(arr);
        int total = n + n1;
        double median;

        if (total % 2 == 0) 
        {
            median = (arr[total / 2] + arr[total / 2 - 1]) / 2.0;
        } 
        else 
        {
            median = (double) arr[total / 2];
        }

        System.out.println("median:"+median);
    }
   public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();
        

        System.out.println("Enter first array size");
        int n = sc.nextInt();
        System.out.println("Enter second array size");
        int m = sc.nextInt();
        System.out.println("Enter first array elements");
        int nums1[]=new int [n];
        for(int i=0;i<n;i++)
        {
            nums1[i]=sc.nextInt();
        }
       System.out.println("Enter second array elements");
        int nums2[]=new int [m];
        for(int i=0;i<m;i++)
        {
            nums2[i]=sc.nextInt();
        }
        
        ob.findMedianSortedArrays(nums1,nums2); 
        sc.close();
    }
}
Median of Two Sorted Arrays of Different Size
