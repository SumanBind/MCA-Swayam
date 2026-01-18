class Solution 
{
    public int sumOddLengthSubarrays(int[] arr) 
    {
    int n = arr.length;
    int sum = 0;

    for (int i = 0; i < n; i++)
     {
        int left = i + 1;
        int right = n - i;

        int oddCount = (left * right + 1) / 2;
        sum += arr[i] * oddCount;
      }
    return sum;
    }
}
