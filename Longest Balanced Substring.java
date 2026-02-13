/*You are given a string s consisting only of the characters 'a', 'b', and 'c'.

A substring of s is called balanced if all distinct characters in the substring appear the same number of times.

Return the length of the longest balanced substring of s.

 

Example 1:

Input: s = "abbac"

Output: 4

Explanation:

The longest balanced substring is "abba" because both distinct characters 'a' and 'b' each appear exactly 2 times.

Example 2:

Input: s = "aabcc"

Output: 3

Explanation:

The longest balanced substring is "abc" because all distinct characters 'a', 'b' and 'c' each appear exactly 1 time.

Example 3:

Input: s = "aba"

Output: 2

Explanation:

One of the longest balanced substrings is "ab" because both distinct characters 'a' and 'b' each appear exactly 1 time. Another longest balanced substring is "ba".

 */





import java.util.*;
class SSS
{
    public int longestBalanced(String s) 
    {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) 
        {
            
            int countA = 0, countB = 0, countC = 0;

            for (int j = i; j < n; j++) 
            {

                char ch = s.charAt(j);

                if (ch == 'a') 
                countA++;
                else if (ch == 'b')
                 countB++;
                else countC++;

                if (isBalanced(countA, countB, countC)) 
                {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }

    private boolean isBalanced(int a, int b, int c) 
    {

        if (a == 0 && b == 0) return true;
        if (a == 0 && c == 0) return true;
        if (b == 0 && c == 0) return true;

        if (a == 0) return b == c;
        if (b == 0) return a == c;
        if (c == 0) return a == b;

        return a == b && b == c;
    }

    
    public static void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        SSS ob=new SSS();
        int result =ob.longestBalanced(s);
        System.out.println(result);
        
    }
}
