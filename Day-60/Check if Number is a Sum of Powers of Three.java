package collage;
import java.util.*;
public class Solution1 
{ 
		public static void main(String []args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number : ");
			int n=sc.nextInt();
			Solution1 ob=new Solution1();
			System.out.println(ob.checkPowersOfThree(n));
		}

	    public boolean checkPowersOfThree(int n) 
	    {
	        while (n > 0) 
	        {
	            int remainder = n % 3;
	            if (remainder > 1) 
	            {
	                return false;
	            }
	            n /= 3;
	        }
	        return true;
	    }
	}

