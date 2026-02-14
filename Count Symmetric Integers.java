class Solution 
{
    public int countSymmetricIntegers(int low, int high) 
    {
        int count = 0;

        for (int num = low; num <= high; num++) 
        {

            int digits = countDigits(num);

            if (digits % 2 != 0)
                continue;

            if (isSymmetric(num))
                count++;
        }

        return count;
    }

     private int countDigits(int num) 
     {
        int count = 0;
        while (num > 0) 
        {
            count++;
            num /= 10;
        }
        return count;
    }

    private boolean isSymmetric(int num) 
    {
        int digits = countDigits(num);
        int half = digits / 2;

        int rightSum = 0;
        int leftSum = 0;

        int temp = num;
        for (int i = 0; i < half; i++) 
        {
            rightSum += temp % 10;
            temp /= 10;
        }

        for (int i = 0; i < half; i++) 
        {
            leftSum += temp % 10;
            temp /= 10;
        }

        return leftSum == rightSum;
    }

}
