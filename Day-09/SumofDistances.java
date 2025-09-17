import java.util.*;

class SumofDistances {
    public long[] distance(int[] nums) {
        long[] result = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            long sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    sum += Math.abs(i - j);
                }
            }
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] aa = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            aa[i] = sc.nextInt();
        }

        SumofDistances ob = new SumofDistances();
        long[] res = ob.distance(aa);

        System.out.println("Result array:");
        for (long x : res) {
            System.out.print(x + " ");
        }
    }
}
