class Solution 
{
    public long getDescentPeriods(int[] prices) 
    {
        long count =0;
        long length=1;
        for(int i=0;i<prices.length;i++)
        {
            if(i==0||prices[i-1]-prices[i]!=1)
            {
                length=1;
            }
            else
            {
                length++;
            }
            count+=length;
        }
        return count;
    }
}
