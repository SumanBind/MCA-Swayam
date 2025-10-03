import java.util.*;

class Solution
 {
    public int integerBreak(int n)
     {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;

        int product = 1;
        while (n > 4) 
        {
            product = product * 3;
            n = n - 3;
        }
        product = product * n;
        return product;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int p = ob.integerBreak(n);
        System.out.println("Maximum Product: " + p);

        sc.close();
    }
}
