/*
Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.

An English letter b is greater than another letter a if b appears after a in the English alphabet.

 

Example 1:

Input: s = "lEeTcOdE"
Output: "E"
Explanation:
The letter 'E' is the only letter to appear in both lower and upper case.
Example 2:

Input: s = "arRAzFif"
Output: "R"
Explanation:
The letter 'R' is the greatest letter to appear in both lower and upper case.
Note that 'A' and 'F' also appear in both lower and upper case, but 'R' is greater than 'F' or 'A'.
Example 3:

Input: s = "AbCdEfGhIjK"
Output: ""
Explanation:
There is no letter that appears in both lower and upper case.*/

import java.util.*;

public class GreatestEnglishLetterUpperAndLowerCase
{

    public String MaxWay(String s) 
    {

         char max = 0;

        for (int i = 0; i < s.length(); i++)
        {
            int a = s.charAt(i);

            for (int j = i + 1; j < s.length(); j++)
            {
                int b = s.charAt(j);

                if (a + 32 == b || a - 32 == b)
                {
                    char upper;

                    // convert into uppercase
                    if(a < b)
                    {
                        upper = (char)a;
                    }
                    else
                    {
                        upper = (char)b;
                    }

                    // store greatest uppercase letter
                    if(upper > max)
                    {
                        max = upper;
                    }
                }
            }
        }

        if(max == 0)
        {
            return "";
        }

        return "" + max;
    }

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String s = sc.next();

       GreatestEnglishLetterUpperAndLowerCase ob = new GreatestEnglishLetterUpperAndLowerCase();

        String result = ob.MaxWay(s);

        System.out.println(" Greatest English Letter in Upper and Lower Case : " + result);
    }
}
