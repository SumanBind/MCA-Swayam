/*
A square matrix is said to be an X-Matrix if both of the following conditions hold:

All the elements in the diagonals of the matrix are non-zero.
All other elements are 0.
Given a 2D integer array grid of size n x n representing a square matrix, return true if grid is an X-Matrix. Otherwise, return false.

 

Example 1:


Input: grid = [[2,0,0,1],[0,3,1,0],[0,5,2,0],[4,0,0,2]]
Output: true
Explanation: Refer to the diagram above. 
An X-Matrix should have the green elements (diagonals) be non-zero and the red elements be 0.
Thus, grid is an X-Matrix.
Example 2:


Input: grid = [[5,7,0],[0,3,1],[0,5,0]]
Output: false
Explanation: Refer to the diagram above.
An X-Matrix should have the green elements (diagonals) be non-zero and the red elements be 0.
Thus, grid is not an X-Matrix.
*/
import java.util.*;
public class Check {

	 public boolean checkXMatrix(int[][] grid) 
	    {  
	      int r = grid.length;     
	      int c = grid[0].length;    

	        if(r!=c)
	        {
	            return false;
	        }
	        for(int i=0;i<r;i++)
	        {
	            for(int j=0;j<c;j++)
	            {
	                if(i==j||i+j==r-1)
	                {
	                    if(grid[i][j]==0)
	                    return false;
	                }
	                else if(i!=j&&i+j!=r-1)
	                {
	                   if(grid[i][j]!=0)
	                   {
	                    return false;
	                   }
	                }
	            }
	        }
	            return true;
	    }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row :");
		int r=sc.nextInt();
		System.out.println("Enter cloun :");
		int c=sc.nextInt();
		System.out.println("Enter values:");
		int a[][]=new int [r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		Check ob=new Check();
		System.out.println(ob.checkXMatrix(a));
	}

}
