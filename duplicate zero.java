import java.util.*;
public class Dublicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
	            if (a[i] == 0)
	            {

	                for (int j = n - 1; j > i + 1; j--) 
	                {
	                    a[j] = a[j - 1];
	                }
	                
	                a[i + 1] = 0;
	                i++; 
	            }
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}

	}

}
