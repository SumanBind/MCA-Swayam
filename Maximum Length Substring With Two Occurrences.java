/*Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each character.
 

Example 1:

Input: s = "bcbbbcba"

Output: 4

Explanation:

The following substring has a length of 4 and contains at most two occurrences of each character: "bcbbbcba".
Example 2:

Input: s = "aaaa"

Output: 2

Explanation:

The following substring has a length of 2 and contains at most two occurrences of each character: "aaaa".
*/

class Solution 
{
    public int maximumLengthSubstring(String s) 
    {
        
        int[] count = new int[26];
        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) 
        {

            count[s.charAt(right) - 'a']++;

            while (count[s.charAt(right) - 'a'] > 2) 
            {
                count[s.charAt(left) - 'a']--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
