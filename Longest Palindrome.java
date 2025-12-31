class Solution 
{
    public int longestPalindrome(String s) 
    {
        int[] f = new int[128];
        int ans = 0;

        for (char c : s.toCharArray())
            f[c]++;

        for (int x : f)
            ans += x / 2 * 2;

        return ans < s.length() ? ans + 1 : ans;
    }
}
