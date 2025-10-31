import java.util.*;

public class Solution 
{
    public boolean hasSameDigits(String s) 
  {
        int arr[] = new int[s.length()];
        int i = 0;
        for (char ch : s.toCharArray()) 
        {
            arr[i++] = ch - '0'; 
        }

        int j = 1;
        while (j <= s.length() - 2) 
        {
            for (int k = 0; k < arr.length - j; k++)
              {
                arr[k] = (arr[k] + arr[k + 1]) % 10;
            }
            j++;
        }

        return arr[0] == arr[1];
    }

    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter a string of digits: ");
        String s = sc.nextLine();

        boolean result = sol.hasSameDigits(s);
        System.out.println("Has same last two digits after operations? " + result);

        sc.close();
    }
}
