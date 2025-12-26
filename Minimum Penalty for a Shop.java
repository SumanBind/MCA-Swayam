class Solution 
{
    public int bestClosingTime(String customers) 
    {

        int penalty = 0;

        for (int i = 0; i < customers.length(); i++) 
        {
            if (customers.charAt(i) == 'Y') 
            {
                penalty++;
            }
        }

        int minPenalty = penalty;
        int bestHour = 0;

        for (int j = 0; j < customers.length(); j++) 
        {

            if (customers.charAt(j) == 'Y') 
            {
                penalty--;  
            }
             else 
             {
                penalty++;   
            }

            if (penalty < minPenalty) 
            {
                minPenalty = penalty;
                bestHour = j + 1;
            }
        }

        return bestHour;
    }
}
