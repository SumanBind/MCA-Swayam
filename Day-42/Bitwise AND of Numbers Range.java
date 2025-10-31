import java.util.*;

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int ans = right;
        while (right > left) {
            ans = right & (right - 1);
            right = ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter left value: ");
        int left = sc.nextInt();

        System.out.print("Enter right value: ");
        int right = sc.nextInt();

        int result = sol.rangeBitwiseAnd(left, right);
        System.out.println("Range Bitwise AND result: " + result);
    }
}
