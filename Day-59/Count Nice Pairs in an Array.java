import java.util.*;

class Solution {
  public static void main(String [] arg)
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nums[]=new int[n];
    for(int i=0;i<n;i++)
      {
        nums[i]=sc.nextInt();
      }
    Solution ob=new Solution();
    System.out.println(ob.countNicePairs(nums));
  }

    private int reverse(int x) {
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev;
    }

    public int countNicePairs(int[] nums) {
        int MOD = 1000000007;
        HashMap<Integer, Integer> freq = new HashMap<>();
        long count = 0;

        for (int num : nums) {
            int key = num - reverse(num);
            int prevCount = freq.getOrDefault(key, 0);
            count = (count + prevCount) % MOD;
            freq.put(key, prevCount + 1);
        }

        return (int) count;
    }
}
