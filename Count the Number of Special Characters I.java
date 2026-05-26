/*
You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.

Return the number of special letters in word.

 

Example 1:

Input: word = "aaAbcBC"

Output: 3

Explanation:

The special characters in word are 'a', 'b', and 'c'.

Example 2:

Input: word = "abc"

Output: 0

Explanation:

No character in word appears in uppercase.

Example 3:

Input: word = "abBCab"

Output: 1

Explanation:

The only special character in word is 'b'.*/

import java.util.*;

public class MinimunWay {

    public int MaxWay(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            int a = s.charAt(i);
            boolean flag = false;

            for (int j = i + 1; j < s.length(); j++) {

                int b = s.charAt(j);

                if (a + 32 == b || a - 32 == b) {

                    // check duplicate
                    for (int k = 0; k < i; k++) {

                        int c = s.charAt(k);

                        if (c == a || c == a + 32 || c == a - 32) {
                            flag = true;
                            break;
                        }
                    }

                    if (!flag) {
                        count++;
                    }

                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String:");
        String s = sc.next();

        MinimunWay ob = new MinimunWay();

        int result = ob.MaxWay(s);

        System.out.println("Count the Number of Special Characters : " + result);
    }
}
