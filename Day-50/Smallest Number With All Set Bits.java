import java.util.*;

public class Solution 
{
    public int smallestNumber(int n)
  {
        for (int i = 0; i <= n; i++) 
        {
            int z = 1 << i; 
            if (z > n)
                return z - 1; 
        }
        return 0;
    }

    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = sol.smallestNumber(n);
        System.out.println("Smallest number with all bits set (<= next power of 2 - 1): " + result);

        sc.close();
    }
}
