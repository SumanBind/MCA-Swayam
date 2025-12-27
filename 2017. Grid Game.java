class Solution 
{
    public long gridGame(int[][] grid) 
    {
        int n = grid[0].length;

        long topSum = 0;
        for (int i = 0; i < n; i++)
        {
            topSum += grid[0][i];
        }

        long bottomSum = 0;
        long answer = Long.MAX_VALUE;

        for (int i = 0; i < n; i++)
        {
            topSum -= grid[0][i];

            long robot2 = Math.max(topSum, bottomSum);

            answer = Math.min(answer, robot2);

            bottomSum += grid[1][i];
        }

        return answer;
    }
}
