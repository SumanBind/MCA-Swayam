class Solution 
{
    public int maximumSwap(int num) 
    {
         String[] k = Integer.toString(num).split("");
        int m = num;
        boolean f = false;
        for (int i = 0; i < k.length; i++) 
        {
            for (int j = i + 1; j < k.length; j++) 
            {
                if (k[i].compareTo(k[j]) < 0) 
                {
                    // Swap
                    String temp = k[i];
                    k[i] = k[j];
                    k[j] = temp;

                    // Update max
                    m = Math.max(m, Integer.parseInt(String.join("", k)));

                    // Swap back
                    temp = k[i];
                    k[i] = k[j];
                    k[j] = temp;

                    f = true;
                }
            }
            if (f) break; // One swap only
        }
        return m;
    }
}
