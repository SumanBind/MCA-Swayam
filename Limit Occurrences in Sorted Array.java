/*
You are given a sorted integer array nums and an integer k.

Return an array such that each distinct element appears at most k times, while preserving the relative order of the elements in nums.

Note: If a distinct element appears at least k times, then it must appear exactly k times in the resulting array.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,1,2,2,3]

Explanation:

Each element can appear at most 2 times.

The element 1 appears 3 times, so only 2 occurrences are kept.
The element 2 appears 2 times, so both occurrences are kept.
The element 3 appears 1 time, so it is kept.
Thus, the resulting array is [1, 1, 2, 2, 3].

Example 2:

Input: nums = [1,2,3], k = 1

Output: [1,2,3]

Explanation:

All elements are distinct and already appear at most once, so the array remains unchanged.

 */



import java.util.ArrayList;
import java.util.Scanner;
class LimitOccurrencesInSortedArray
{
    public ArrayList<Integer> LimitOccurrences(int a[],int k)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        int count=0;
         arr.add(a[0]);
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==a[i-1])
            {
                count++;
            }
            else{
                count =0;
            }
            if(count<k)
            {
                arr.add(a[i]);
            }
        }
        return arr;
    }
    public static void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Enter K value:");
        int k=sc.nextInt();
        int a[]=new int [n];
        System.out.println("Enter array values:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        LimitOccurrencesInSortedArray ob=new LimitOccurrencesInSortedArray();
        System.out.println("Result:");
       ArrayList<Integer> arr1= ob.LimitOccurrences(a,k);
       for(int r: arr1)
       {
        System.out.println(r);
       }
    }
}
