/*
Given an integer num, return a string of its base 7 representation.

 

Example 1:

Input: num = 100
Output: "202"
Example 2:

Input: num = -7
Output: "-10"
 */

class Solution 
{
    public String convertToBase7(int num)
     {
        if (num == 0) 
        {
            return "0";
        }

        boolean negative = num < 0;
        num = Math.abs(num);

        String result = "";

        while (num > 0)
        {
            result = (num % 7) + result;
            num /= 7;
        }

        if (negative) 
        {
            result = "-" + result;
        }

        return result;
    }
}
