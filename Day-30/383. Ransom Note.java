class Solution 
{
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        int arr1[]=new int[200];
        int arr2[]=new int[200];
        for(int i=0;i<ransomNote.length();i++)
        {
        char c=ransomNote.charAt(i);
        arr1[c]++;
        }
        for(int i=0;i<magazine.length();i++)
        {
        char c=magazine.charAt(i);
        arr2[c]++;
        }
        for(int i=0;i<200;i++)
        {
        if(arr1[i]>arr2[i])
        return false;
         }
         return true;
    }
}
