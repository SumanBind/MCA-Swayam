import java.util.*;

class Solution4 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter array elements: ");
        int piles[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            piles[i] = sc.nextInt();
        }

        System.out.print("Enter K value: ");
        int k = sc.nextInt();

        Solution4 ob = new Solution4();
        System.out.println("Result: " + ob.minStoneSum(piles, k));

        sc.close();
    }

    public int minStoneSum(int[] piles, int k) 
    {
        int n = piles.length;

        for (int i = 0; i < k; i++) 
        {
            Arrays.sort(piles);
            int largest = piles[n - 1];

            if (largest <= 1)
                break;

            piles[n - 1] = largest - (largest / 2);
        }

        long sum = 0;
        for (int v : piles)
            sum += v;

        return (int) sum;
    }
}
