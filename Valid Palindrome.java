class Solution 
{
    public boolean isPalindrome(String s) 
    {
           s = s.toLowerCase();
        String s1="";
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='0'&&s.charAt(i)<='9'))
            {
                s1+=s.charAt(i);
            }
        }
        int left=0;
        int right=s1.length()-1;
        while(left<right)
        {
            if(s1.charAt(left)!=s1.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
