import java.util.*;

public class Solution 
{
    public int totalMoney(int n) 
  {
        int sum = 0, m = 0, count = 0;

        for (int i = 1; i <= n; i++) 
        {
            if (count == 7)
            {
                count = 0;
                m = i / 7 + 1;
            }
            else
            {
                m++;
            }
            sum += m;
            count++;
        }
        return sum;
    }

    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter number of days (n): ");
        int n = sc.nextInt();

        int result = sol.totalMoney(n);
        System.out.println("Total money saved after " + n + " days: " + result);

        sc.close();
    }
}
