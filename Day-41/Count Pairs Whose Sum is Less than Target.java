import java.util.*;

class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        List<Integer> nums = new ArrayList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        int result = sol.countPairs(nums, target);
        System.out.println("Number of pairs with sum less than target: " + result);
    }
}
