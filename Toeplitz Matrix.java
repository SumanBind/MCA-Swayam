/*
Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.

A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.

 

Example 1:


Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
Output: true
Explanation:
In the above grid, the diagonals are:
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
In each diagonal all elements are the same, so the answer is True.
Example 2:


Input: matrix = [[1,2],[2,2]]
Output: false
Explanation:
The diagonal "[1, 2]" has different elements.
*/

import java.util.*;
public class ToeplitzMatrix 
{
	public boolean isToeplitzMatrix(int[][] matrix) 
	{
		int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {

                if(matrix[i][j] != matrix[i-1][j-1]) {
                    return false;
                }
            }
        }

        return true;
    }

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int r=sc.nextInt();
		System.out.println("Enter calums");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter elements");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			ToeplitzMatrix ob =new ToeplitzMatrix();
			boolean result=ob.isToeplitzMatrix(a) ;
			System.out.println(result);
	}

}
