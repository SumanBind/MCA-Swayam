class Solution 
{
    public int minimumSwap(String s1, String s2) 
    {
        int xy = 0; // s1 = x , s2 = y
        int yx = 0; // s1 = y , s2 = x

        // Step 1: Count mismatches
        for (int i = 0; i < s1.length(); i++) 
        {
            char a = s1.charAt(i);
            char b = s2.charAt(i);

            if (a == 'x' && b == 'y')
             {
                xy++;
            } else if (a == 'y' && b == 'x') 
            {
                yx++;
            }
        }

        // Step 2: If total mismatches is odd → impossible
        if ((xy + yx) % 2 != 0) 
        {
            return -1;
        }

        // Step 3: Calculate minimum swaps
        return (xy / 2) + (yx / 2) + (xy % 2) * 2;
    }
}
