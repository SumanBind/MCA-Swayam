class Solution 
{
    public static int SumMultiple(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(i%3==0)
            {
                sum+=i;
            }
            else if(i%5==0)
            {
                sum+=i;
            }
            else if(i%7==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
    public int sumOfMultiples(int n) 
    {
        return SumMultiple(n);
    }
}