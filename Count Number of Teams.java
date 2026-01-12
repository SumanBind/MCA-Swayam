import java.util.*;
class Solution 
{
    public int numTeams(int[] rating)
    {
        int count=0;
        int n=rating.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    if(rating[i]<rating[j]&&rating[j]<rating[k])
                    {
                        count++;
                    }
                    else if(rating[i]>rating[j]&&rating[j]>rating[k])
                    {
                             count++;
                    }
                }
            }
            
        }
        return count;
    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of Array:");
        int n=sc.nextInt();
        System.out.println(" Enter value of Array");
        int rating[]=new int[n];
        for(int i=0;i<n;i++)
        {
                rating[i]=sc.nextInt();
        }
        Solution ob=new Solution();
        int result=ob.numTeams(rating);
        System.out.println("Total Time :"+result);
    }
}
