class Solution 
{
    public boolean checkDivisibility(int n) 
    {
        int original = n;
        if (original < 0)
         original = -original;

        int sum = 0;
        int product = 1;
        int x = original;

        do {
            int d = x % 10;
            sum += d;
            product *= d;
            x /= 10;
        } while (x != 0);

        int total = sum + product;

        if (total == 0)
         return false;

        return (original % total) == 0;
        
    }
}
