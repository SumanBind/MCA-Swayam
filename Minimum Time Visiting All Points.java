import java.util.*;
class Solution 
{
    public int minTimeToVisitAllPoints(int[][] points) 
    {
        int totaltime=0;
        for(int i=1;i<points.length;i++)
        {
            int x=Math.abs(points[i][0]-points[i-1][0]);
            int y=Math.abs(points[i][1]-points[i-1][1]);
            totaltime+=Math.max(x,y);
        }
        return totaltime;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of point:");
        int n=sc.nextInt();
        System.out.println(" Enter value of X and Y");
        int points[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                points[i][j]=sc.nextInt();
            }
        }
        Solution ob=new Solution();
        int result=ob.minTimeToVisitAllPoints(points);
        System.out.println("Total Time :"+result);
    }
}
