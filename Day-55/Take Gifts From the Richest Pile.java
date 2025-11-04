import java.util.*;
class Solution3 
{
    public static void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number of element: ");
        int n=sc.nextInt();

        System.out.println("Enter array elements: ");
        int gifts[]=new int[n];
        for(int i=0;i<n;i++)
        {
            gifts[i]=sc.nextInt();
        }
        System.out.println("Enter K values: ");
        int k=sc.nextInt();
        Solution3 ob=new Solution3 ();
        System.out.println(ob.pickGifts(gifts,k));

    }
    public long pickGifts(int[] gifts, int k) 
    {
        int n=gifts.length;
        long sum=0;
        for(int i=0;i<k;i++)
        {
            Arrays.sort(gifts);
             gifts[n-1]=(int)Math.sqrt(gifts[n-1]);
        }
        for(int i=0;i<n;i++)
        {
            sum+=gifts[i];
        }
        return sum;
    }
}
