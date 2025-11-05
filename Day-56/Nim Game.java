import java.util.*;

class Solution 
{
    public boolean canWinNim(int n) 
    {
        return n % 4 != 0;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stones: ");
        int n = sc.nextInt();

        Solution obj = new Solution();
        boolean result = obj.canWinNim(n);

        if (result)
            System.out.println("You can win the game!");
        else
            System.out.println("You will lose the game.");
    }
}
