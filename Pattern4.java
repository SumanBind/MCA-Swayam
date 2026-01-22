/*Enter a Number :
7
   **********
   *        *
   *        *
   *        *
   *        *
   *        *
   **********
   @        @
   @        @
   @        @
   @        @
   @        @
   @        @
   @        @
******* *******
 *****   *****
  ***     ***
   *       *
*/




import java.util.Scanner;
public class Pattern4 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n+n/2;j++)
			{
				if(i==0||j==0||i==n-1||j==n+n/2-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n/2;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n+n/2;j++)
			{
				if(j==0||j==n+n/2-1)
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<=n/2;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<n-i*2;k++)
			{
				System.out.print("*");
			}
			for(int j=0;j<i*2+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<n-i*2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
