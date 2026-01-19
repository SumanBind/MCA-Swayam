class Solution 
{
    public int maxSideLength(int[][] mat, int threshold) 
    {
    int m = mat.length;
        int n = mat[0].length;
        int c = 0;

        for (int size = 1; size <= Math.min(m, n); size++) 
        {
            boolean possible = false;

            for (int i = 0; i + size <= m; i++) 
            {
                for (int j = 0; j + size <= n; j++) 
                {
                    int sum = 0;

                    for (int x = i; x < i + size; x++) 
                    {
                        for (int y = j; y < j + size; y++) 
                        {
                            sum += mat[x][y];
                        }
                    }

                    if (sum <= threshold) 
                    {
                        possible = true;
                        break;
                    }
                }
                if (possible) break;
            }

            if (possible)
                c = size;
            else
                break;
        }

        return c;
    }
}
