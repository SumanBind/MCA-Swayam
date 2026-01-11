class Solution {
    public int[] addNegabinary(int[] arr1, int[] arr2) {
         int n = arr1.length;
        int m = arr2.length;
        int[] temp = new int[Math.max(n, m) + 5];
         int i = n - 1;
        int j = m - 1;
        int k = temp.length -1;
          int carry = 0;
         while (i >= 0 || j >= 0 || carry != 0) 
         {

            int sum = carry;

            if (i >= 0) sum += arr1[i--];
            if (j >= 0) sum += arr2[j--];

             temp[k] = sum & 1;

            carry = (sum - temp[k]) / -2;

            k--;
        }
        k++;
        while (k < temp.length - 1 && temp[k] == 0) 
        {
            k++;
        }
        int size = temp.length - k;
        int[] result = new int[size];

        for (int x = 0; x < size; x++) 
        {
            result[x] = temp[k + x];
        }

        return result;
    }
}
