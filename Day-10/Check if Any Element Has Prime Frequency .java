class Solution 
{
    public boolean checkPrimeFrequency(int[] nums) 
    {
       int[] freq = new int[101];
		for(int n : nums) 
        {
            freq[n]++;
		}

        for (int num : freq)
        {
            if(isPrime(num)) return true;
        }
		
        return false;
    }

    private boolean isPrime(int val)
    {
        if(val <= 1) return false;
        if(val == 2) return true;
        if(val%2==0) return false;
        for(int i=3; i<= Math.sqrt(val); i+=2)
        {
            if(val%i==0)
             return false;
        }
        return true; 
    }
}
