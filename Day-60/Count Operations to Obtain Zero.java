package collage;
import java.util.*;
public class Soution 
{
	  public static void main(String [] arg)
	  {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter first number:");
	    int num1=sc.nextInt();
	    System.out.println("Enter second number:");
	    int num2=sc.nextInt();
	    Soution ob=new Soution();
	    int p=ob.countOperations(num1,num2);
	    System.out.println("Result:"+p);
	  }
	    public int countOperations(int num1, int num2) 
	    {
	        int count=0;
	         while(num1>0&&num2>0)
	         {
	            if(num1 >= num2) 
	            {
	                num1 -= num2;
	            } 
	            else 
	            {
	                num2 -= num1;
	            }
	            count++;
	        }
	        return count;
	    }
	}
	    



