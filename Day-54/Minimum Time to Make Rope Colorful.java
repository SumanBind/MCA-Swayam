// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public int minCost(String colors, int[] neededTime) 
    {
        int time=0;
        for(int i=1;i<colors.length();i++)
        {
            if(colors.charAt(i-1)==colors.charAt(i))
            {
                if(neededTime[i-1]>neededTime[i])
                {
                    time+=neededTime[i];
                    neededTime[i]=neededTime[i-1];
                }
                else
                {
                   time+=neededTime[i-1];
                   neededTime[i]=neededTime[i];
                }
            }
        }
        return time;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter a String:");
        String colors=sc.next();
        int n=colors.length();
        int[] neededTime=new int[n]; 
        System.out.println("Enter needed Time:");
        for(int i=0;i<n;i++)
        {
            neededTime[i]=sc.nextInt();
        }
       Main obj = new Main();  
        System.out.println(obj.minCost(colors, neededTime));
    }
}
