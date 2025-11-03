import java.util.*;
class Solution1 
{
    public String getSmallestString(String s) 
    {
        char[] arr = s.toCharArray(); 
        
        for (int i = 1; i < arr.length; i++) 
        {
            if(arr[i]%2==0&&arr[i-1]%2==0)
            {
            if (arr[i - 1] > arr[i]) 
            {
                
                char temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
                break; 
            }
            }
            else if(arr[i]%2!=0&&arr[i-1]%2!=0)
            {
            if (arr[i - 1] > arr[i]) 
            {
                
                char temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
                break; 
            }
            }
        }
        
        return new String(arr); 
    }
    public static void main(String [] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.next();
        Solution1 ob=new Solution1();
        System.out.println(ob.getSmallestString(s) );
    }
}
