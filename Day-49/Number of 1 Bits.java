import java.util.*;

public class Solution 
{
    public int hammingWeight(int n) 
  {
        int count = 0;
        while (n != 0) {
            count += (n & 1); 
            n = n >>> 1;    
        }
        return count;
    }

    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = sol.hammingWeight(n);
        System.out.println("Number of set bits (1s): " + result);

        sc.close();
    }
}
