import java.util.*;
public class Solution 
{
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) 
  {
        // If one rectangle is on the left or above the other — no overlap
        if (rec1[2] <= rec2[0] || rec2[2] <= rec1[0] ||
            rec1[1] >= rec2[3] || rec2[1] >= rec1[3]) {
            return false;
        }
        return true;
    }

    public static void main(String[] args)
  {
        Solution s = new Solution();
    Scanner sc=new Scanner(System.in);
    int rec1[]=new int[4];
    int rec2[]=new int[4];
    for(int i=0;i<4;i++)
      {
        rec1[i]=sc.nextInt();
      }
    for(int i=0;i<4;i++)
      {
        rec2[i]=sc.nextInt();
      }
        System.out.println(s.isRectangleOverlap(rec1, rec2)); 
        
}
