class Solution 
{
    public int countNumbersWithUniqueDigits(int n) 
    {
        int count = 1;
        if (n >= 1) 
        count += 9;
        
        int base = 9;
        int options = 9;

        for (int i = 2; i <= n; i++) 
        {
            base = base * options;
            count += base;
            options--;
        }

        return count;
    }
}
