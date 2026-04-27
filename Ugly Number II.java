/*  An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return the nth ugly number.

 

Example 1:

Input: n = 10
Output: 12
Explanation: [1, 2, 3, 4, 5, 6, 8, 9, 10, 12] is the sequence of the first 10 ugly numbers.
Example 2:

Input: n = 1
Output: 1
Explanation: 1 has no prime factors, therefore all of its prime factors are limited to 2, 3, and 5.
 */


class Solution 
{
    public int nthUglyNumber(int n) 
    {
        int count = 0;
        int m = 1;

        while (true)
        {
            if (isUgly(m))
            {
                count++;
                if (count == n)
                    return m;
            }
            m++;
        }
    }

    public boolean isUgly(int num)
    {
        if (num <= 0) return false;

        while (num % 2 == 0) 
            num /= 2;
        while (num % 3 == 0) 
            num /= 3;
        while (num % 5 == 0)
            num /= 5;

        return num == 1;
    }
}
