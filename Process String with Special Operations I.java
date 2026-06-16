/*You are given a string s consisting of lowercase English letters and the special characters: *, #, and %.

Build a new string result by processing s according to the following rules from left to right:

If the letter is a lowercase English letter append it to result.
A '*' removes the last character from result, if it exists.
A '#' duplicates the current result and appends it to itself.
A '%' reverses the current result.
Return the final string result after processing all characters in s.

 

Example 1:

Input: s = "a#b%*"

Output: "ba"

Explanation:

i	s[i]	Operation	Current result
0	'a'	Append 'a'	"a"
1	'#'	Duplicate result	"aa"
2	'b'	Append 'b'	"aab"
3	'%'	Reverse result	"baa"
4	'*'	Remove the last character	"ba"
Thus, the final result is "ba".

Example 2:

Input: s = "z*#"

Output: ""

Explanation:

i	s[i]	Operation	Current result
0	'z'	Append 'z'	"z"
1	'*'	Remove the last character	""
2	'#'	Duplicate the string	""
Thus, the final result is "".

 */

class Solution 
{
    public String processStr(String s) 
    {
        String s1 = "";
        int n = s.length();

        for(int i = 0; i < n; i++)
        {
            if(s.charAt(i) == '#')
            {
                s1 = s1 + s1;
            }
            else if(s.charAt(i) == '%')
            {
                s1 = Rev(s1);
            }
            else if(s.charAt(i) == '*')
            {
                if(s1.length() > 0)
                {
                    s1 = s1.substring(0, s1.length() - 1);
                }
            }
            else
            {
                s1 = s1 + s.charAt(i);
            }
        }

        return s1;
    }

    public String Rev(String s1)
    {
        int n = s1.length();
        String s2 = "";

        for(int i = n - 1; i >= 0; i--)
        {
            s2 = s2 + s1.charAt(i);
        }

        return s2;
    }
}
