/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.

 

Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
*/
import java.util.Scanner;
class KthMissingPositiveNumber
{
    public int Missing(int a[],int k)
    {
        int n=a.length;
        int i=0;
        int p=1;
        while(k>0)
        {
            if(i<n&&a[i]==p)
            {
                i++;
            }
            else{
                k--;
                if(k==0)
                {
                    return p;
                }
            }
            p++;
        }
        return -1;
    }
    public static void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Enter a K value:");
        int k=sc.nextInt();
        System.out.println("Enter array element:");
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        KthMissingPositiveNumber ob=new KthMissingPositiveNumber();
        int result =ob.Missing(a,k);
        System.out.println("Result :"+result);
    }
}
