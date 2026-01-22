/*Enter a Number :
7
*******
   e
   e
   e
   e
   e
   e
   e
   e
   e
*******
 *****
  ***
   *
*/





import java.util.Scanner;

public class Pattern3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int i=0;i<n+2;i++)
		{
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}
			System.out.print("e");
			System.out.println();
		}
		for(int i=0;i<=n/2;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<n-2*i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
     
