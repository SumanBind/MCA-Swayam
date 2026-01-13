class Solution 
{
    public boolean isPrefixString(String s, String[] words) 
    {
        String built = "";

        for (int i = 0; i < words.length; i++) 
        {
            built = built + words[i];

            if (built.equals(s)) 
            {
                return true;
            }

            if (built.length() > s.length()) 
            {
                return false;
            };
        }

        return false;
    }
}
